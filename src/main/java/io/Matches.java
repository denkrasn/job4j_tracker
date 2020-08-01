package io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 11;
        while (sum > 0) {
            System.out.print("Введите количество спичек: ");
            int select = Integer.valueOf(input.nextLine());
            if (select >= 1 && select <= 3) {
                sum = sum - select;
                System.out.println("Спичек осталось: " + sum);

                }
            }
        System.out.println("Победитель!");
        }
    }
