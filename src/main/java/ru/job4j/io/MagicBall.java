package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = scanner.nextLine();
        int answer = new Random().nextInt(3);
        System.out.println(answer);
        if (answer == 0) {
            System.out.println("Да");
        } else if (answer == 1) {
            System.out.println("No");
        } else {
            System.out.println("Maybe");
        }
    }
}
