package com.walking.intensive.chapter1.task2;

public class Task2 {
    public static void main(String[] args) { // Метод main
        int floorAmount = 4;
        int entranceAmount = 4;
        int flatNumber = 64;
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
        int entranceNumber = (flatNumber / entrenceCapacity);
        int currentFloor = (flatNumber - (entranceNumber * entrenceCapacity)) / floorCapacity;

        if (flatNumber == flatQuantity) {
            --entranceNumber;
            currentFloor = --entranceAmount;

        }

        int flatPos = flatNumber % floorCapacity;
        String flatPosition = null;
        switch (flatPos) {
            case 1:
                flatPosition = "слева от лифта, влево";
                break;
            case 2:
                flatPosition = "слева от лифта, вправо";
                break;
            case 3:
                flatPosition = "справа от лифта, влево";
                break;
            case 4:
            case 0:
                flatPosition = "справа от лифта, вправо";
                break;
            default:
                flatPosition = "";
        }
        String result = flatNumber + " кв - " + (entranceNumber + 1) + " подъезд " + (currentFloor + 1) + " этаж " + flatPosition;

        return result; // Заглушка. При реализации - удалить
    }
}

