package ru.job4j.tracker;

public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "Add a new Item!";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        Item item = new Item(input.askStr("Enter name throw input"));
        tracker.add(item);
        return true;
    }
}