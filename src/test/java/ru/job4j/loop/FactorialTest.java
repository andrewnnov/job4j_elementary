package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expectedResult = 120;
        int actualResult = Factorial.calc(5);
        assertEquals(expectedResult,  actualResult);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expectedResult = 1;
        int actualResult = Factorial.calc(0);
        assertEquals(expectedResult,  actualResult);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int expectedResult = 1;
        int actualResult = Factorial.calc(1);
        assertEquals(expectedResult,  actualResult);
    }
}