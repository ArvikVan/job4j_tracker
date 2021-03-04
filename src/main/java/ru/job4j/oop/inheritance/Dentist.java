package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private String thisIsDentict;

    public Dentist(String name, String surname, String education, int birthday, String thisIsDoctor, String thisIsDentict) {
        super(name, surname, education, birthday, thisIsDoctor);
        this.thisIsDentict = thisIsDentict;
    }

    public Dentist() {
    }

    private String dentistMethod() {
        return "This is dentistMethod from Dentist extends Doctor";
    }
}
