package ru.job4j.tracker.pojo;

import ru.job4j.tracker.pojo.Student;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Красноштан");
        student.setName("Денис");
        student.setMiddleName("Константинович");
        student.setGroup("7Ю");
        student.setDateOfReceipt("01.09.2009");
        System.out.println("ФИО: " + student.getSurname() + " " + student.getName() + " " + student.getMiddleName());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Дата поступления: " + student.getDateOfReceipt());
    }
}
