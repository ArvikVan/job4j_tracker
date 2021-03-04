package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private String thisIsProgrammer;

    public Programmer() {
    }

    private String progMethod() {
        return "This is progMethod from Programmer extends Engineer";
    }
}
