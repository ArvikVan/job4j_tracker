package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        Item item = new Item(input.askStr("Enter name throw input"));
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int id = input.askInt("Получить id заявки, "
                + "которую мы будем изменять через input");
        Item item = new Item(input.askStr("Получить имя заявки на которую"
                + " мы будем заменять через input"));
        if (tracker.replace(id, item)) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("ERROR");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int id = input.askInt("Получить id заявки, которую"
                + " мы будем удалять через input");
        if (tracker.delete(id)) {
            System.out.println("SUCCES");
        } else {
            System.out.println("ERROR");
        }
    }

    public static void findAllItem(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        int id = input.askInt("Получить id заявки, которую мы"
                + " будем искать в хранилище через input");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        String name = input.askStr("Получить имя заявок, которые"
                + " мы будем искать через input");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Choose menu через input");
            if (select == 0) {
               StartUI.createItem(input, tracker);
            } else if (select == 1) {
               StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
               StartUI.findByNameItem(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find item by name");
        System.out.println("6. Exit program");
        System.out.println("Select: ");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
        StartUI.createItem(input, tracker);
    }
}
