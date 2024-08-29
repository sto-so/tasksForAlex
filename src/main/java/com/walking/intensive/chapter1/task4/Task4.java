package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https:/ /geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 1;
        double b = 2;
        double c = 3;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    /**
     * При формировании строки, корни уравнения должны указываться по возрастанию.
     * <p>
     * Примеры результирующей строки:
     * <p>
     * Количество решений: 2. Корни: -4;4
     * <p>
     * Количество решений: 1. Корень: 0
     * <p>
     * Количество решений: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {
        double x, x1, x2;
        double discr = b * b + 4 * a * c;
        if (discr == 0) {
            x = -b / 2 * a;

        } else if (discr > 0) {
            x1 = -b + Math.sqrt(discr) / 2 * a;
            x2 = -b - Math.sqrt(discr) / 2 * a;
        } else if (discr < 0) {
            System.out.println("Количество решений: 0.");
        }

        return null;  // Заглушка. При реализации - удалить
    }
}