package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько вам лет? ");
        int age = scanner.nextInt();

        String ageWord = getAgeWord(age);
        System.out.println("Вам " + age + " " + ageWord + ".");


        scanner.close();
    }

    private static String getAgeWord(int age) {
        int lastDigit = age % 10;
        int lastTwoDigits = age % 100;

        if (lastDigit == 1 && lastTwoDigits != 11) {
            return "год";
        } else if ((lastDigit >= 2 && lastDigit <= 4) && (lastTwoDigits < 12 || lastTwoDigits > 14)) {
            return "года";
        } else {
            return "лет";
        }
    }
}