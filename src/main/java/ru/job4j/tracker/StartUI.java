package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item itemDateTime = new Item();
        itemDateTime.getCreated();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String itemDateTimeFormat = itemDateTime.getCreated().format(formatter);
        System.out.println("Выводим полученную дату в консоль: " + itemDateTimeFormat);
    }
}
