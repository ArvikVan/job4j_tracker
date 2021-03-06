package ru.job4j.ex;

public class JdbcConfig {
    public static void load(String url) throws UserInputExeption {
        if (url == null) {
            throw new UserInputExeption("Url could not be null");
        }
    }

    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputExeption e) {
            e.printStackTrace();
        }
    }
}
