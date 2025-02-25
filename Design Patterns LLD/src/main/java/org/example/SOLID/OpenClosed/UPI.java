package org.example.SOLID.OpenClosed;

public class UPI implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Payment made through UPI : " + amount);
    }
}
