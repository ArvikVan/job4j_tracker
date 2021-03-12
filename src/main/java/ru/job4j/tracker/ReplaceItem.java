package ru.job4j.tracker;

public class ReplaceItem implements UserAction {
    private final Output output;

    public ReplaceItem(Output output) {
        this.output = output;
    }

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
            output.println("SUCCESS");
        } else {
            output.println("ERROR");
        }
        return true;
    }
}
