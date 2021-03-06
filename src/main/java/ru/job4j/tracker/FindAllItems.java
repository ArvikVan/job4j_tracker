package ru.job4j.tracker;

public class FindAllItems implements UserAction {
    private final Output output;

    public FindAllItems(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "- Find all items -";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
           output.println(item);
        }
        return true;
    }
}
