package org.example.bridge;

/** Bridge abstraction: a payment HAS a channel instead of extending one. */
public abstract class PaymentNotification {
    protected final NotificationChannel channel;
    protected final String recipient;
    protected final double amount;

    protected PaymentNotification(NotificationChannel channel, String recipient, double amount) {
        this.channel = channel;
        this.recipient = recipient;
        this.amount = amount;
    }

    public void sendNotification() {
        channel.send(recipient, getMessage());
    }

    public abstract String getMessage();
}
