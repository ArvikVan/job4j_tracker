package ru.job4j.tracker;

public class FindByIdItem implements UserAction {
    private final Output output;

    public FindByIdItem(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "- Find by id item -";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Получить id заявки, которую мы"
                + " будем искать в хранилище через input");
        Item item = tracker.findById(id);
        if (item != null) {
            output.println(item);
        } else {
            output.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
