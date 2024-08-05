package com.walking.intensive.chapter1.task2;

public class Task2 {// класс task2

    public static void main(String[] args) { // Метод main
        int floorAmount = 2;
        int entranceAmount = 2;
        int flatNumber = 11;
        String result = getFlatLocation(floorAmount, entranceAmount, flatNumber);
        System.out.println(result);

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) { // Метод get...
        if (flatNumber > 16 || flatNumber <= 0) {
            String result = " Такой квартиры нет.";
            return result;
        }
        if (flatNumber <= 8) {
            entranceAmount = 1;

        }
        if (flatNumber <= 4) {
            floorAmount = 1;
        } else if (flatNumber >= 9 && flatNumber <= 12) {
            floorAmount = 1;

        }
        String pos;
        switch (flatNumber) {
            case 1:
            case 5:
            case 9:
            case 13:
                pos = "слева от лифта, влево";
                break;
            case 2:
            case 6:
            case 10:
            case 14:
                pos = "слева от лифта, вправо";
                break;
            case 3:
            case 7:
            case 11:
            case 15:
                pos = "справа от лифта, влево";
                break;
            case 4:
            case 8:
            case 12:
            case 16:
                pos = "справа от лифта, вправо";
                break;
            default:
                pos = "";
        }


        String result = flatNumber + " кв - " + entranceAmount + " подъезд " + floorAmount + " этаж " + pos;

        return result; // Заглушка. При реализации - удалить
    }
}


