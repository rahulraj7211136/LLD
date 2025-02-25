package org.example.SOLID.OpenClosed;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.makePayment(new CreditCard(), 100);
        paymentProcessor.makePayment(new DebitCard(), 120);
        paymentProcessor.makePayment(new UPI(), 150);
    }
}
