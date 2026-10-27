package org.example.bridge;

/** Console simulation of a email notification channel. */
public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[Email to " + recipient + "] " + message);
    }
}
