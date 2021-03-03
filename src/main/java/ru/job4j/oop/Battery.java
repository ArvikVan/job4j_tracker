package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBatt = new Battery(13);
        Battery secondfBatt = new Battery(5);
        System.out.println("firstBatt " + firstBatt.load + ". secondBatt " + secondfBatt.load);
        firstBatt.exchange(secondfBatt);
        System.out.println("firstBatt " + firstBatt.load + ". secondBatt " + secondfBatt.load);
    }
}
