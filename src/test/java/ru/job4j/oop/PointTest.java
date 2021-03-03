package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02To20Then28() {
        Point a = new Point(0, 2);
        Point b = new Point(2, 0);
        double expected = 2.82;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42To25Then36() {
        Point a = new Point(4, 2);
        Point b = new Point(2, 5);
        double expected = 3.6;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42To2Then316() {
        Point a = new Point(4, 2);
        Point b = new Point(1, 1);
        double expected = 3.16;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To52Then538() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 2);
        double expected = 5.38;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}