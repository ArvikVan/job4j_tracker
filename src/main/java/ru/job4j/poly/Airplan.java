package ru.job4j.poly;

public class Airplan implements Vehicle {
    @Override
    public void move() {
        System.out.println("Я перемещаюсь на самолете");
    }
}
