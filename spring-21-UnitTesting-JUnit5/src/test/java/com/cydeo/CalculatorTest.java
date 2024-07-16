package com.cydeo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        System.out.println("Add method");
        int actual = Calculator.add(2,3);
        assertEquals(5,actual,"Test Failed");
    }

    @Test
    void testCase1(){
    //    System.out.println("Test case 1");
        fail("Not implemented yet");
    }

    @Test
    void testCase2(){
        System.out.println("Test case 2");
    }

    @Test
    void testCase3(){
        System.out.println("Test case 3");
    }

    @Test
    void testCase4(){
        System.out.println("Test case 4");
    }

    @Test
    void testCase5(){
        System.out.println("Test case 5");
    }
}