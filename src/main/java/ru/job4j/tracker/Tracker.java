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

    public Item findById(int id) {          /* проверяет в цикле все элементы массива items, сравнивая id с аргументом int id
                                                        и возвращает найденный Item. Если Item не найден - возвращает null.*/
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }

        return rsl;
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
        return names;
    }

}

