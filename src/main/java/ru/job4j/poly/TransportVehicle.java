package ru.job4j.poly;

public class TransportVehicle {
    public static void main(String[] args) {
        Vehicle boeng = new Airplan();
        Vehicle express = new Train();
        Vehicle superBus = new AutoBus();

        Vehicle[] vehicles = new Vehicle[]{boeng, express, superBus};
        for (Vehicle index : vehicles) {
            index.move();
        }
    }
}
