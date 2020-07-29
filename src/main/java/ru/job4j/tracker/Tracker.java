package ru.job4j.tracker;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {

        return Arrays.copyOf(items, size);
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

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                names[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(names, count);
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            this.items[index] = item;
            rsl = true;
        }
        return rsl;

    }

    public boolean delete(int id) {
        boolean rls = false;
        int index = indexOf(id);
        if (index != -1) {
            arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
            rls = true;
        }
        return rls;
    }
}



