package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String thisIsDoctor;

    public Doctor() {
    }

    private String doctorMethod() {
        return  "This is doctorMethod  from Doctor extends Profession";
    }

}
