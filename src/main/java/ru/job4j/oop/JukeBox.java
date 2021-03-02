package ru.job4j.oop;

public class JukeBox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже ");
        } else if (position == 2) {
            System.out.println("Спокойной ночи ");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        JukeBox chooseTheSong = new JukeBox();
        chooseTheSong.music(1);
        chooseTheSong.music(2);
        chooseTheSong.music(3);
    }
}
