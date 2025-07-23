package org.example.session16;

public class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String nameSet) {
        this.name = nameSet;
    }

    public String getName() {
        return name;
    }

    public void setId(int setId) {
        this.id = setId;
    }

    public int getId() {
        return id;
    }

    public void performDuties() {
        System.out.println("this person performs some default duties.");
    }
}
