package org.example.bridge;

import java.util.Locale;

public class OnlinePaymentNotification extends PaymentNotification {
    private final String paymentMethod;

    public OnlinePaymentNotification(NotificationChannel channel, String recipient,
                                     double amount, String paymentMethod) {
        super(channel, recipient, amount);
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String getMessage() {
        return String.format(Locale.US, "Online payment of $%.2f received via %s.",
                             amount, paymentMethod);
    }
}
