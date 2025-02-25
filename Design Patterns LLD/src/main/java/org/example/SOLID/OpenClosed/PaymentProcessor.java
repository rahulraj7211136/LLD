package org.example.SOLID.OpenClosed;

public class PaymentProcessor {
    public void makePayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
