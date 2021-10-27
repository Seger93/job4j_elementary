package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double degreeAndSubtraction(double first, double second) {
        return degree(first, second)
                + subtraction(first, second);
    }

    public static double allSum(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + degree(first, second)
                + subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат рассчета равен " + sumAndMultiply(10, 20)
                + " Сумма всех методов " + allSum(40, 50)
                + " Рассчет деления и вычитания = " + degreeAndSubtraction(20, 30));
    }
}
