package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    private final Output output;

    public DeleteItem(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "- Delete item -";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Получить id заявки, которую"
                + " мы будем удалять через input");
        if (tracker.delete(id)) {
            output.println("SUCCES");
        } else {
            output.println("ERROR");
        }
        return true;
    }
}
