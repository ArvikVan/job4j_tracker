package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                System.out.println(rsl + " " + value[i]);
                break;
            } else {
                throw new ElementNotFoundException("Element could not found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"one", "two", "three"};
        try {
            indexOf(value, "findme");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
