package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rs1 = p / (2 * (k + 1));
        double l = rs1 * k;
        double s = l * rs1;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result);
    }

}
