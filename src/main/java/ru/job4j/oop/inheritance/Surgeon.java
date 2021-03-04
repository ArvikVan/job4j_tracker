package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private String thisIsSurgeon;

    public Surgeon() {
    }

    private String surgeonMethod() {
        return "This is surgeonMethod from Surgeon extends Doctor";
    }
}
