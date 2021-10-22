package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rs1 = (height - 100) * 1.15;
        return rs1;
    }

    public static double womanWight(short height) {
        double rs1 = (height - 110) * 1.15;
        return rs1;
    }

    public static void main(String[] args) {
        short height = 184;
        double men = Fit.manWeight(height);
        double women = Fit.womanWight(height);
        System.out.println("Man 184 is " + men + " Women 184 is " + women);
    }
}
