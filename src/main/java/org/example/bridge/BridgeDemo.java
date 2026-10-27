package org.example.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SmsChannel();

        new OnlinePaymentNotification(email, "customer@example.com", 50.0, "credit card").sendNotification();
        new OnlinePaymentNotification(sms, "555-0100", 35.5, "PayPal").sendNotification();
        new CashOnDeliveryPayment(email, "customer@example.com", 40.0).sendNotification();
        new CashOnDeliveryPayment(sms, "555-0100", 40.0).sendNotification();
        new BitcoinPayment(email, "customer@example.com", 75.0).sendNotification();
        new BitcoinPayment(sms, "555-0100", 75.0).sendNotification();
        NotificationChannel push = new PushChannel();
        new OnlinePaymentNotification(push, "customer-device", 20.0, "credit card").sendNotification();
        new CashOnDeliveryPayment(push, "customer-device", 25.0).sendNotification();
    }
}
