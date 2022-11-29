package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Payload;

public class CKEncryption {
    private String consumerKey;
    private String consumerSecret;
    private Encrypt encryption;
    private boolean debug = true;

    public CKEncryption(String consumerKey, String consumerSecret){
        this.consumerKey=consumerKey;
        this.consumerSecret=consumerSecret;
        this.encryption=new Encrypt(this.consumerKey,this.consumerSecret);
    }

    public String encrypt(String jsonPayload) throws Exception {
        try {
            String encryptedPayload = this.encryption.encrypt(jsonPayload);
            if (this.debug) {
                System.out.println("JSON =>" + jsonPayload);
                System.out.println("Encrypted Payload =>" + encryptedPayload);
            }

            return encryptedPayload;
        } catch (Exception var3) {
            System.err.println("Exception in encrypting payload " + var3);
            throw var3;
        }
    }

    public String encrypt(Payload payload) throws Exception {
        ObjectMapper objMapper = new ObjectMapper();
        try {
            String jsonPayload = objMapper.writeValueAsString(payload);
            return this.encrypt(jsonPayload);
        } catch (Exception var4) {
            System.err.println("Exception in encrypting payload " + var4);
            throw var4;
        }
    }

}
