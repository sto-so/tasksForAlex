package com.walking.intensive.chapter1.task2;

public class Task2 {// класс task2

    public static void main(String[] args) { // Метод main
        int floorAmount = 4;
        int entranceAmount = 6;
        int flatNumber = 20;
        String result = getFlatLocation(floorAmount, entranceAmount, flatNumber);
        System.out.println(result);

    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) { // Метод get...
        int floorCapacity = 4;
        int entrenceCapacity = floorAmount * floorCapacity;
        int flatQuantity = floorAmount * entranceAmount * floorCapacity;
        if (flatNumber > flatQuantity || flatNumber <= 0) {
            return "Такой квартиры нет.";
        }
        int i = 0;  // надо решить через условия
        while (true) {
            i++;
            if (flatNumber <= entrenceCapacity * i) {
                break;
            }
            //entrenceCapacity += entrenceCapacity;
        }

        if (flatNumber <= 4) {
            floorAmount = 1; //
        } else if (flatNumber >= 9 && flatNumber <= 12) {
            floorAmount = 1;

        }
        String flatPosition;
        switch (flatNumber) {
            case 1:
            case 5:
            case 9:
            case 13:
                flatPosition = "слева от лифта, влево";
                break;
            case 2:
            case 6:
            case 10:
            case 14:
                flatPosition = "слева от лифта, вправо";
                break;
            case 3:
            case 7:
            case 11:
            case 15:
                flatPosition = "справа от лифта, влево";
                break;
            case 4:
            case 8:
            case 12:
            case 16:
                flatPosition = "справа от лифта, вправо";
                break;
            default:
                flatPosition = "";
        }


        String result = flatNumber + " кв - " + i + " подъезд " + floorAmount + " этаж " + flatPosition;

        return result; // Заглушка. При реализации - удалить
    }
}


