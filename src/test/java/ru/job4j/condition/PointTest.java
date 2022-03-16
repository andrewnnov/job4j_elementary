package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to31then2() {
        double expected = 2;
        Point a = new Point(1, 1);
        Point b = new Point(3, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to66then0() {
        double expected = 0;
        Point a = new Point(2, 2);
        Point b = new Point(6, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to62then4() {
        double expected = 4;
        int x1 = 2;
        int y1 = 2;
        int x2 = 6;
        int y2 = 2;
        Point a = new Point(2, 2);
        Point b = new Point(6, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}