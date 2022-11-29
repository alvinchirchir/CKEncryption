package services;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

public class Encrypt {
    private String consumerKey;
    private String consumerSecret;

    public Encrypt(String consumerKey, String consumerSecret) {
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
    }

    String encrypt(String plainText) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashedIV = digest.digest(this.consumerKey.getBytes(StandardCharsets.UTF_8));
        byte[] hashedSecret = digest.digest(this.consumerSecret.getBytes(StandardCharsets.UTF_8));
        IvParameterSpec key = new IvParameterSpec(bytesToHex(hashedIV).substring(0, 16).getBytes());
        SecretKeySpec secret = new SecretKeySpec(bytesToHex(hashedSecret).substring(0, 32).getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secret, key);
        byte[] encrypted = cipher.doFinal(plainText.getBytes());
        String params = Base64.getEncoder().encodeToString(encrypted);
        System.out.println("Base64 Param byte=" + params);
//        String result = Base64.getEncoder().encodeToString(params.getBytes());
//        System.out.println("final result=" + result);
        return params;
    }

    static String bytesToHex(byte[] data) {
        if (data == null) {
            return null;
        } else {
            int len = data.length;
            String string = "";

            for(int i = 0; i < len; ++i) {
                if ((data[i] & 255) < 16) {
                    string = string + "0" + Integer.toHexString(data[i] & 255);
                } else {
                    string = string + Integer.toHexString(data[i] & 255);
                }
            }

            return string;
        }
    }
}
