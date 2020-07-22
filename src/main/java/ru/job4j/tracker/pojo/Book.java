package ru.job4j.tracker.pojo;

public class Book {
    private String names;
    private int pageCount;

    public Book(String names, int pageCount) {
        this.names = names;
        this.pageCount = pageCount;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
