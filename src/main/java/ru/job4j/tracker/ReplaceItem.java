package ru.job4j.tracker;

public class ReplaceItem implements UserAction {
    @Override
    public String name() {
        return "- Replace item -";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Получить id заявки, "
                + "которую мы будем изменять через input");
        Item item = new Item(input.askStr("Получить имя заявки на которую"
                + " мы будем заменять через input"));
        if (tracker.replace(id, item)) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("ERROR");
        }
        return true;
    }
}
