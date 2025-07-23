package org.example.session16;

public class EnsuranceBill implements Billing{
    @Override
    public void generateBill(Patient patient) {
        System.out.println("Generated a bill for patient.");
    }
}
