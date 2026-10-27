package org.example.bridge;

import java.util.Locale;

public class CashOnDeliveryPayment extends PaymentNotification {
    public CashOnDeliveryPayment(NotificationChannel channel, String recipient, double amount) {
        super(channel, recipient, amount);
    }

    @Override
    public String getMessage() {
        return String.format(Locale.US, "Cash on delivery: $%.2f is due when your order arrives.", amount);
    }
}
