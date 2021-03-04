package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private String thisIsDentict;

    public Dentist() {
    }

    private String dentistMethod() {
        return "This is dentistMethod from Dentist extends Doctor";
    }
}
