package org.example.SOLID.OpenClosed;

public class DebitCard implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Payment made through Debit Card : " + amount);
    }
}
