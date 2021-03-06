package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
       /* Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;*/
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                itemsWithoutNull[count] = items[i];
                count++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemByName = new Item[items.length];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(key)) {
                itemByName[count] = items[i];
                count++;
            }
        }
        itemByName = Arrays.copyOf(itemByName, size);
        return itemByName;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != 1;
        if (rsl) {
            item.setId(items[index].getId());
            items[index] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != 1;
        if (rsl) {
            items[index] = null;
            System.arraycopy(items, index + 1, items, index, items.length - index - 1);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }

}