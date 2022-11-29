package models;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class Payload {

    @JsonProperty("msisdn")
    private long msisdn;

    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty("client_code")
    private String clientCode;
    @JsonProperty("customer_email")
    private String customerEmail;
    @JsonProperty("customer_first_name")
    private String customerFirstName;
    @JsonProperty("customer_last_name")
    private String customerLastName;

    @JsonProperty("due_date")
    private String dueDate;

    @JsonProperty("merchant_transaction_id")
    private String merchantTransactionId;

    @JsonProperty("preferred_payment_option_code")
    private String preferredPaymentOptionCode;

    @JsonProperty("success_redirect_url")
    private String successRedirectUrl;
    @JsonProperty("pending_redirect_url")
    private String pendingRedirectUrl;
    @JsonProperty("fail_redirect_url")
    private String failRedirectUrl;
    @JsonProperty("callback_url")
    private String callbackUrl;

    @JsonProperty("request_amount")
    private double requestAmount;
    @JsonProperty("request_description")
    private String requestDescription;
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    @JsonProperty("service_code")
    private String serviceCode;

    @JsonProperty("language_code")
    private String languageCode;

    public Payload(long msisdn, String accountNumber, String countryCode, String currencyCode, String clientCode, String customerEmail, String customerFirstName, String customerLastName, String dueDate, String merchantTransactionId, String preferredPaymentOptionCode, String successRedirectUrl, String pendingRedirectUrl, String failRedirectUrl, String callbackUrl, double requestAmount, String requestDescription, String invoiceNumber, String serviceCode, String languageCode) {
        this.msisdn = msisdn;
        this.accountNumber = accountNumber;
        this.countryCode = countryCode;
        this.currencyCode = currencyCode;
        this.clientCode = clientCode;
        this.customerEmail = customerEmail;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.dueDate = dueDate;
        this.merchantTransactionId = merchantTransactionId;
        this.preferredPaymentOptionCode = preferredPaymentOptionCode;
        this.successRedirectUrl = successRedirectUrl;
        this.pendingRedirectUrl = pendingRedirectUrl;
        this.failRedirectUrl = failRedirectUrl;
        this.callbackUrl = callbackUrl;
        this.requestAmount = requestAmount;
        this.requestDescription = requestDescription;
        this.invoiceNumber = invoiceNumber;
        this.serviceCode = serviceCode;
        this.languageCode = languageCode;
    }

    public Payload() {
    }

    public String toString() {
        return "\"Payload [merchantTransactionId = " + this.merchantTransactionId + ", customerFirstName = " + this.customerFirstName + ", customerLastName = " + this.customerLastName + ", msisdn = " + this.msisdn + ", customerEmail = " + this.customerEmail + ", requestAmount = " + this.requestAmount + ", currencyCode = " + this.currencyCode + ", accountNumber = " + this.accountNumber + ", serviceCode = " + this.serviceCode + ", dueDate = " + this.dueDate + ", requestDescription = " + this.requestDescription + ", countryCode = " + this.countryCode + ", languageCode = " + this.languageCode + ", preferredPaymentOptionCode = " + this.preferredPaymentOptionCode + ", successRedirectUrl = " + this.successRedirectUrl + ", failRedirectUrl = " + this.failRedirectUrl + ", pendingRedirectUrl = " + this.pendingRedirectUrl + ", callbackUrl = " + this.callbackUrl + "]";
    }
}
