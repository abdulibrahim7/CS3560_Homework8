package org.example.bridge;

/** Console simulation of a sms notification channel. */
public class SmsChannel implements NotificationChannel {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[SMS to " + recipient + "] " + message);
    }
}
