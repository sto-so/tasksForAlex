package com.walking.intensive.chapter1.task3;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите год: ");
        int year = scanner.nextInt();

        System.out.println(isLeap(year));

        scanner.close();
    }

    static boolean isLeap(int year) {

        if (year % 4 == 0 || year % 400 == 0 ) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }

        return false;
    }
}


// алишев про классы и методы