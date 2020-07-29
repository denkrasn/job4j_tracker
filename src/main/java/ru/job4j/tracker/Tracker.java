package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];    //содержит возможное количество заявлений.
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {        //добавляет заявку, переданную в аргументах в массив заявок items.
        item.setId(ids++);              //Поле ids используется для генерации нового ключа.
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
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
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
}



