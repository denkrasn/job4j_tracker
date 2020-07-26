package ru.job4j.tracker;

public class Item {       //Класс Item описывает модель заявления.
    private int id;         //уникальный номер заявления
    private String name;  //название заявления


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}