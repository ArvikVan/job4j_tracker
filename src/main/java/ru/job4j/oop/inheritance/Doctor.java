package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String thisIsDoctor;

    public Doctor() {
    }

    public Doctor(String name, String surname,
                  String education, int birthday, String thisIsDoctor) {
        super(name, surname, education, birthday);
        this.thisIsDoctor = thisIsDoctor;
    }

    private String doctorMethod() {
        return  "This is doctorMethod  from Doctor extends Profession";
    }

}
