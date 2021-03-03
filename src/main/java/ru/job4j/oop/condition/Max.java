package ru.job4j.oop.condition;

public class Max {
    public static int max(int left, int right, int midle) {
        return max(midle, max(left, right));
    }

    public static int max(int left, int right, int midle, int first) {
        return max(first, max(left, right, midle));
    }

    public static int max(int left, int right) {
        return (left > right) ? left : right;
    }

    public static void main(String[] args) {
        int rsl = Max.max(879, 879);
        System.out.println(rsl);
    }
}
