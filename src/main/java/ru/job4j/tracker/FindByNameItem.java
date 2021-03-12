package ru.job4j.tracker;

public class FindByNameItem implements UserAction {
    private final Output output;

    public FindByNameItem(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "- Find by name item -";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findByName(input.askStr("Получить имя заявок, которые"
                + " мы будем искать через input"));
        if (items.length > 0) {
            for (Item item : items) {
                output.println(item);
            }
        } else {
            output.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
