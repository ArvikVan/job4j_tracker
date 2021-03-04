package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private String thiIsBuilder;

    public Builder(String name, String surname, String education, int birthday, String thisIsEngineer, String thiIsBuilder) {
        super(name, surname, education, birthday, thisIsEngineer);
        this.thiIsBuilder = thiIsBuilder;
    }

    public Builder() {
    }

    private String builderMethod() {
        return "This is builderMethod from Builder extends Engineer";
    }
}
