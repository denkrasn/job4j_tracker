package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 153);
        Book book2 = new Book("ПРОБЛЕМЫ АВТОСТОПА В ОТКРЫТОМ КОСМОСЕ", 1024);
        Book book3 = new Book("КАК УПРАВЛЯТЬ ВСЕЛЕННОЙ, НЕ ПРИВЛЕКАЯ ВНИМАНИЯ САНИТАРОВ", 666);
        Book book4 = new Book("КАК СДЕЛАТЬ ЧТОБЫ ОТПУСТИЛО ПОЖАЛУЙСТА", 103);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book rd = books[index];
            System.out.println(rd.getNames() + " - " + rd.getPageCount());
        }
        System.out.println();

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int index = 0; index < books.length; index++) {
            Book rd = books[index];
            System.out.println(rd.getNames() + " - " + rd.getPageCount());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book rd = books[index];
            String s = "Clean code";
            if (rd.getNames().equals(s)){
                System.out.println(s);
            }
        }
    }
}
