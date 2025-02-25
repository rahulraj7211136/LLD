package org.example.SOLID.OpenClosed;

public class CreditCard implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Payment made through Credit Card : " + amount);
    }
}
