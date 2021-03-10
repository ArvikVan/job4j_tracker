package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Choose menu через input"));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name через input");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            } else if (select == 2) {
                int id = Integer.valueOf(input.askInt("Получить id заявки, "
                        + "которую мы будем изменять через input"));
                String name = input.askStr("Получить имя заявки на которую"
                        + " мы будем заменять через input");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("ERROR");
                }
            } else if (select == 3) {
                int id = Integer.valueOf(input.askInt("Получить id заявки, которую"
                        + " мы будем удалять через input"));
                if (tracker.delete(id)) {
                    System.out.println("SUCCES");
                } else {
                    System.out.println("ERROR");
                }
            } else if (select == 4) {
                int id = Integer.valueOf(input.askInt("Получить id заявки, которую мы"
                        + " будем искать в хранилище через input"));
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                String name = input.askStr("Получить имя заявок, которые"
                        + " мы будем искать через input");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i]);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }
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
    }
}
