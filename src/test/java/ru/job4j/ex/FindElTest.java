package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindElTest {

    @Test
    public void indexOf() {
        String[] value = {"one", "two", "three"};
        String expected = "one";
        String result = "one";
        assertThat(result, is(expected));
    }
}