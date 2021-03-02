package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args) {
        String deskField = "Somthing about desc";
        Fix fix = new Fix(deskField);
    }
}
