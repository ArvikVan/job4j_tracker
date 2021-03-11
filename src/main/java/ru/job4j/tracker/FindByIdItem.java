package ru.job4j.tracker;

public class FindByIdItem implements UserAction {
    @Override
    public String name() {
        return "- Find bu id item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Получить id заявки, которую мы"
                + " будем искать в хранилище через input");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
