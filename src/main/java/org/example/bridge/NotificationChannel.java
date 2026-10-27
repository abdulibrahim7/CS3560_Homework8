package org.example.bridge;

/** Bridge implementor: payment classes depend on this interface. */
public interface NotificationChannel {
    void send(String recipient, String message);
}
