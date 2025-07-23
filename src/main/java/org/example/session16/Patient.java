package org.example.session16;

public class Patient extends Person {
    private String illness;

    public Patient(String name, int id,String illness) {
        super(name, id);
        this.illness=illness;
    }

}
