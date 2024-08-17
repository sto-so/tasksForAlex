package com.walking.intensive.chapter1.task2;

public class Task2 {
    public static void main(String[] args) {
        int floorAmount = 4;
        int entranceAmount = 4;
        int flatNumber = 30;

        try {
            System.out.println(getFlatLocation(floorAmount, entranceAmount, flatNumber));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int floorCapacity = 4;
        int entrenceCapacity = floorAmount * floorCapacity;
        int flatQuantity = floorAmount * entranceAmount * floorCapacity;

        if (flatNumber > flatQuantity || flatNumber <= 0) {
            return "Такой квартиры нет.";
        }

        int currentEntrance = flatNumber / entrenceCapacity;
        int currentFloor = flatNumber / floorCapacity % floorAmount;

        if (flatNumber != flatQuantity) {
            currentEntrance = currentEntrance + 1;
            currentFloor = currentFloor + 1;
        }

        int flatRemains = flatNumber % floorCapacity;
        String flatPosition = switch (flatRemains) {
            case 1 -> "слева от лифта, влево";
            case 2 -> "слева от лифта, вправо";
            case 3 -> "справа от лифта, влево";
            case 0 -> "справа от лифта, вправо";
            default -> throw new IllegalArgumentException("Лезь искать в switch case.");
        };

        return flatNumber + " кв - " + currentEntrance + " подъезд " + currentFloor + " этаж " + flatPosition;
    }
}

