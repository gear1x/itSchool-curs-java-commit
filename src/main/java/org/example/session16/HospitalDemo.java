package org.example.session16;

import javax.swing.plaf.DimensionUIResource;

public class HospitalDemo {
    public static void main(String[] args) {
        Person staff = new Person("Marc", 1);
        Person doctor = new Doctor("Ariana", 2);
        Person nurse = new Nurse ("Loser",3);
        Patient patient = new Patient("Spinosaurus",4,"Love-sick");
        staff.performDuties();
        doctor.performDuties();
        nurse.performDuties();
        EnsuranceBill ensuranceBilling = new EnsuranceBill();
        ensuranceBilling.generateBill(patient);
    }
}
