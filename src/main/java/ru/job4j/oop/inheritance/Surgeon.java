package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private String thisIsSurgeon;

    public Surgeon() {
    }

    public Surgeon(String name, String surname, String education,
                   int birthday, String thisIsDoctor, String thisIsSurgeon) {
        super(name, surname, education, birthday, thisIsDoctor);
        this.thisIsSurgeon = thisIsSurgeon;
    }

    private String surgeonMethod() {
        return "This is surgeonMethod from Surgeon extends Doctor";
    }
}
