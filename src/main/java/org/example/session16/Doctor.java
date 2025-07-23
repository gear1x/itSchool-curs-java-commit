package org.example.session16;

public class Doctor extends Person{

    public Doctor(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties(){
        System.out.println(getName()+" performs doctor duties.");
    }
}
