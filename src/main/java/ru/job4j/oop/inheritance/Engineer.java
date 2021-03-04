package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private String thisIsEngineer;

    public Engineer() {
    }

    public Engineer(String name, String surname, String education, int birthday, String thisIsEngineer) {
        super(name, surname, education, birthday);
        this.thisIsEngineer = thisIsEngineer;
    }

    private String engineerMethod() {
        return "This is engineerMethod from Engineer extends Profession";
    }

}
