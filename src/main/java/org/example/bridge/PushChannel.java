package org.example.bridge;

/** Console simulation of a push notification channel. */
public class PushChannel implements NotificationChannel {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[Push to " + recipient + "] " + message);
    }
}
