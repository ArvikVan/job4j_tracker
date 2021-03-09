package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void goBus() {
        System.out.println("Автобус поехал или едет!");
    }

    @Override
    public void passengersBus(int passenger) {
        passenger = 20;
        System.out.println("Автобус вмещает " + passenger + " пассажиров");
    }

    @Override
    public int fuelBus(int fuel) {
        fuel = 30;
        int pricePerLitr = 45;
        int price = fuel * pricePerLitr;
        System.out.println("Цена заправленного топлива = " + price);
        return price;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.goBus();
        bus.passengersBus(20);
        bus.fuelBus(20);
    }
}
