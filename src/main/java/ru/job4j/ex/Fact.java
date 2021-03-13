package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Factorial : " + calc(2));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater then 0");
        }
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl *= i;
        }
        return rsl;
    }
}
