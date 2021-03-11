package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "- Delete item -";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Получить id заявки, которую"
                + " мы будем удалять через input");
        if (tracker.delete(id)) {
            System.out.println("SUCCES");
        } else {
            System.out.println("ERROR");
        }
        return true;
    }
}
