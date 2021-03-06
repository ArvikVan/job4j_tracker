package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {

        Tracker tracker = new Tracker();
        Item firstItem = new Item();
        Item secondItem = new Item();
        firstItem.setId(1);
        firstItem.setName("firstItem.setName");
        secondItem.setId(2);
        secondItem.setName("secondItem.setName");
        tracker.add(firstItem);
        tracker.add(secondItem);
        System.out.println(tracker.findById(2).toString());

        /*Item itemDateTime = new Item();
        itemDateTime.getCreated();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String itemDateTimeFormat = itemDateTime.getCreated().format(formatter);
        System.out.println("Выводим полученную дату в консоль: " + itemDateTimeFormat);*/
    }
}
