package ru.job4j.pojo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Грушевский Александр Анатольевич");
        student1.setGroup(1);
        student1.setCreated("2017");

        System.out.println(student1.getFullName() + ", Проходит обучение в группе - " + student1.getGroup()
                + ", Год поступления: " + student1.getCreated());
    }
}
