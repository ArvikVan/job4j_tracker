package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(output), new Exit(output)};
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("-Replaced Item-"));
        String replacedName = "New Item name";
        Input input = new StubInput(new String[]{"0", String.valueOf(item.getId()),
                replacedName, "1"});
        UserAction[] actions = {new ReplaceItem(output), new Exit(output)};
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("-Deleted item-"));
        Input input = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new DeleteItem(output), new Exit(output)};
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindAllAItems() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("first item"));
        Input in = new StubInput(new String[] {"0", "1"});
        UserAction[] actions = {new FindAllItems(output), new Exit(output)};
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator()
                + "0. - Find all items -" + System.lineSeparator()
                + "1. - Exit -" + System.lineSeparator() + item
                + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. - Find all items -" + System.lineSeparator()
                + "1. - Exit -" + System.lineSeparator()));
    }

    @Test
    public void whenFindById() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("3 item"));
        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new FindByIdItem(output), new Exit(output)};
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator()
                + "0. - Find by id item -" + System.lineSeparator()
                + "1. - Exit -" + System.lineSeparator() + item
                + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. - Find by id item -" + System.lineSeparator()
                + "1. - Exit -" + System.lineSeparator()));
    }

    @Test
    public void whenFindByName() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("whenFindByName"));
        Input in = new StubInput(new String[] {"0", item.getName(), "1"});
        UserAction[] actions = {new FindByNameItem(output), new Exit(output)};
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator()
                + "0. - Find by name item -" + System.lineSeparator()
                + "1. - Exit -" + System.lineSeparator() + tracker.findById(item.getId())
                + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. - Find by name item -" + System.lineSeparator()
                + "1. - Exit -" + System.lineSeparator()));
    }

    @Test
    public void whenExit() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(new String[]{"0"}); // заявка
        UserAction[] actions = {new Exit(output)}; // меню
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator()
                                                + "0. - Exit -" + System.lineSeparator()));
    }
}