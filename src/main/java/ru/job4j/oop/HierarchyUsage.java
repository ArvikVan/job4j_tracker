package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car; // приведение к типу Transport
        Object obj = car; //приведение к типу Object
        Object ocar = new Car(); // приведение типа при создании объекта
        Car carFromObject = (Car) ocar; //приведение типа за счет понижения иерархии
    }
}
