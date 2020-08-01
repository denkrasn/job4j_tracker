package io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 11;
        int count = 1;
        while (sum > 0) {
            String name;
            if (count % 2 != 0) {
                name = "Игрок №1";
            } else name = "Игрок №2";
            count++;
            System.out.print(name + " Введите количество спичек: ");
            int select = Integer.valueOf(input.nextLine());
            if (select >= 1 && select <= 3) {
                sum = sum - select;
                System.out.println("Спичек осталось: " + sum);


            }

        }

        System.out.println("Победитель!");
    }
}
