package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private String thiIsBuilder;

    public Builder() {
    }

    private String builderMethod() {
        return "This is builderMethod from Builder extends Engineer";
    }
}
