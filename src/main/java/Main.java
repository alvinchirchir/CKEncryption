import models.Payload;
import services.CKEncryption;

public class Main {
    public static void main(String[] args) {
        CKEncryption checkoutEncryption = new CKEncryption("faskjnckdsjncdsjknjkcds", "skjfsnvkdsjnkldsccklmcds");
        Payload payload = getPayload();
        String param = null;
        try {
            param = checkoutEncryption.encrypt(payload);
            System.out.println("Encrypted payload=" + param);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Payload getPayload() {
        long msisdn = 123456;
        String accountNumber="12345";
        String countryCode="KEN";
        String currencyCode="KES";
        String clientCode="DEMO";
        String customerEmail="testuser@gmail.com";
        String customerFirstName= "Test";
        String customerLastName = "User";
        String dueDate="2021-11-21";
        String merchantTransactionId = "ABCD12345";
        String preferredPaymentOptionCode="MPESA_KEN";
        String successRedirectUrl="http://mywebsiteurl/success";
        String failRedirectUrl="http://mywebsiteurl/fail";
        String pendingRedirectUrl="http://mywebsiteurl/pending";
        String callbackUrl="http://mywebsiteurl/callback";
        double requestAmount=10.00;
        String requestDescription="Test payment";
        String invoiceNumber = "1";
        String serviceCode="DEMOSERVICE";
        String languageCode="en";

        Payload payload = new Payload(msisdn, accountNumber, countryCode, currencyCode, clientCode,
                customerEmail, customerFirstName, customerLastName, dueDate, merchantTransactionId, preferredPaymentOptionCode,
                successRedirectUrl, failRedirectUrl, pendingRedirectUrl, callbackUrl, requestAmount, requestDescription, invoiceNumber,
                serviceCode,languageCode
                );

        return payload;
    }
}
