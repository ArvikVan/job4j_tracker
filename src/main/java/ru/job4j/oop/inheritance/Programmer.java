package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private String thisIsProgrammer;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education,
                      int birthday, String thisIsEngineer, String thisIsProgrammer) {
        super(name, surname, education, birthday, thisIsEngineer);
        this.thisIsProgrammer = thisIsProgrammer;
    }

    private String progMethod() {
        return "This is progMethod from Programmer extends Engineer";
    }
}
