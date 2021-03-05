package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book firstBook = new Book("firstBook", 100);
        Book secondBook = new Book("secondBook", 200);
        Book thirdBook = new Book("thirdBook", 300);
        Book forthBook = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = firstBook;
        books[1] = secondBook;
        books[2] = thirdBook;
        books[3] = forthBook;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " - " + b.getSize());
        }
        System.out.println("Поменяли 0 и 3 индексы местами.");
        Book temp;
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " - " + b.getSize());
        }
        System.out.println("Выводим все книги с названием Clean code.");
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getName().equals("Clean code")) {
                System.out.println("Ячейка " + i + " " + b.getName()
                        + " имеет название Clean code.");
            }
        }
    }
}
