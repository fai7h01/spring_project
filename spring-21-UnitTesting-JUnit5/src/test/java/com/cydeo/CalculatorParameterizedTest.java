package com.cydeo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS"})
    void testCase1(String arg) {
        assertFalse(arg.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {9, 36, 12})
    void testCase2(int num) {
        assertEquals(0, num % 3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS"})
    //@EmptySource
    //@NullSource
    @NullAndEmptySource
    void testCase3(String arg) {
        assertFalse(arg.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String arg) {
        assertFalse(arg.isEmpty());
    }

    static String[] stringProvider() {
        return new String[]{"Java", "JS", "TS"};
    }

    @ParameterizedTest
    @CsvSource({
            "10, 20, 30",
            "20, 30, 50",
            "100, 200, 400"
    })
    void testCase5(int num1, int num2, int result) {
        assertEquals(result, Calculator.add(num1, num2));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sample-data.csv", numLinesToSkip = 1)
    void testCase6(int num1, int num2, int result) {
        assertEquals(result, Calculator.add(num1, num2));
    }
}
