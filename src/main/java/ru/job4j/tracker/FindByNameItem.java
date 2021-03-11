package ru.job4j.tracker;

public class FindByNameItem implements UserAction {
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
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
