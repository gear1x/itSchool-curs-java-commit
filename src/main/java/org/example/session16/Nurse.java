package org.example.session16;

public class Nurse extends Person {
    public Nurse(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.printf(getName() + "performs nurse duties.");
    }
}
