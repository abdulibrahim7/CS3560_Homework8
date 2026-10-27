package org.example.bridge;

import java.util.Locale;

public class BitcoinPayment extends PaymentNotification {
    public BitcoinPayment(NotificationChannel channel, String recipient, double amount) {
        super(channel, recipient, amount);
    }

    @Override
    public String getMessage() {
        return String.format(Locale.US, "Bitcoin payment of $%.2f received.", amount);
    }
}
