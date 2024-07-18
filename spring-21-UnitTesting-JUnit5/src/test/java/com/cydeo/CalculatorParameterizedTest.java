package com.cydeo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS"})
    void testCase1(String arg){
        assertFalse(arg.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {9, 36, 12})
    void testCase2(int num){
        assertEquals(0, num % 3);
    }

}
