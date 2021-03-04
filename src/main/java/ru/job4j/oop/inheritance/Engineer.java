package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private String thisIsEngineer;

    public Engineer() {
    }

    private String engineerMethod() {
        return "This is engineerMethod from Engineer extends Profession";
    }

}
