package com.calc.tests;

// importing junit stuff

import org.junit.jupiter.api.Test;

// importing model to test
import com.calc.src.CalculatorModel;

import static java.lang.Double.*;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorModelTest {

    // change this constant to change for loop limits in random functions
    private final int RANDOM_ITERATOR_MAX = 25;

    private final CalculatorModel calc = new CalculatorModel();


    @Test
    void add_int_values_test() {

        // normal addition
        assertEquals(11, calc.add(5,6));

        // addition with 0
        assertEquals(10, calc.add(10,0));

        // addition with negative value
        assertEquals(7, calc.add(10,-3));

        // addition with 2 negative values
        assertEquals(-6, calc.add(-3,-3));

        // result with negative value
        assertEquals(-2, calc.add(10,-12));

    }


    @Test
    void add_double_values_test() {

        // normal addition (doubles)
        assertEquals(11.5, calc.add(5.25,6.25));

        // addition with 0 (doubles)
        assertEquals(10.25, calc.add(10.25,0));

        // addition with negative value (doubles)
        assertEquals(7.2, calc.add(10.3,-3.1));

        // addition with 2 negative values (doubles)
        assertEquals(-6.2, calc.add(-3.15,-3.05));

        // result with negative value (doubles)
        assertEquals(-2.2, calc.add(10.3,-12.5));

        // add random doubles (precision x*(e-01))
        double randomDouble1;
        double randomDouble2;
        for (int i = 0; i < RANDOM_ITERATOR_MAX; i++) {
            randomDouble1 = (Math.floor((Math.random()*1000-500))/10);
            randomDouble2 = (Math.floor((Math.random()*1000-500))/10);
            assertEquals((randomDouble1*10 + randomDouble2*10)/10,
                    calc.add(randomDouble1, randomDouble2));
        }

    }


    @Test
    void subtract_int_values_test() {

        // normal subtraction
        assertEquals(11, calc.substract(16,5));

        // subtraction with 0
        assertEquals(10, calc.substract(10,0));

        // subtraction with negative value
        assertEquals(13, calc.substract(10,-3));

        // subtraction with 2 negative values
        assertEquals(1, calc.substract(-3,-4));

        // result with negative value
        assertEquals(-2, calc.substract(10,12));

    }


    @Test
    void subtract_double_values_test() {

        // normal subtraction (doubles)
        assertEquals(2.75, calc.substract(9.25,6.5));

        // subtraction with 0 (doubles)
        assertEquals(10.25, calc.substract(10.25,0));

        // subtraction with negative value (doubles)
        assertEquals(13.4, calc.substract(10.3,-3.1));

        // subtraction with 2 negative values (doubles)
        assertEquals(-0.1, calc.substract(-3.15,-3.05));

        // result with negative value (doubles)
        assertEquals(-2.2, calc.substract(10.3,12.5));

        // subtract random doubles (precision x*(e-01))
        double randomDouble1;
        double randomDouble2;
        for (int i = 0; i < RANDOM_ITERATOR_MAX; i++) {
            randomDouble1 = (Math.floor((Math.random()*1000-500))/10);
            randomDouble2 = (Math.floor((Math.random()*1000-500))/10);
            assertEquals((randomDouble1*10 - randomDouble2*10)/10,
                    calc.substract(randomDouble1, randomDouble2));
        }

    }


    @Test
    void divide_test() {

        // normal division
        assertEquals(13, calc.divide(39,3));
        assertEquals(0.5, calc.divide(15,30));

        // division with negative value
        assertEquals(-13, calc.divide(39,-3));
        assertEquals(-13, calc.divide(-39,3));

        // division with 1
        assertEquals(39, calc.divide(39,1));
        assertEquals(-39, calc.divide(39,-1));

        // division with floating value
        assertEquals(78, calc.divide(39,0.5));
        assertEquals(-78, calc.divide(39,-0.5));
        assertEquals(-78, calc.divide(-39,0.5));
        assertEquals(78, calc.divide(-39,-0.5));

        // positive infinity should throw exception
        try {
            if ((compare(POSITIVE_INFINITY, calc.divide(39,0))) == 0) {
                fail("why would a user expect positive infinity");
            }
        } catch (Exception e) {
            // OK
        }

        // negative infinity should throw exception
        try {
            if ((compare(NEGATIVE_INFINITY, calc.divide(-39,0))) == 0) {
                fail("why would a user expect negative infinity");
            }
        } catch (Exception e) {
            // OK
        }

    }

    @Test
    void multiply_test() {

        // normal multiplication
        assertEquals(21,calc.multiply(3,7));
        assertEquals(calc.multiply(9,18),calc.multiply(18,9));

        // multiply with 1
        assertEquals(10,calc.multiply(10,1));
        assertEquals(calc.multiply(3,15),calc.multiply(15,3));

        // multiply with 0
        assertEquals(0,calc.multiply(32,0));
        assertEquals(calc.multiply(0,35),calc.multiply(35,0));

        // multiply with negative number
        assertEquals(-36,calc.multiply(12,-3));
        assertEquals(calc.multiply(-3,12),calc.multiply(12,-3));

        // multiply with floating number
        assertEquals(25,calc.multiply(12,2.5));
        assertEquals(16.25,calc.multiply(6.5,2.5));
        assertEquals(calc.multiply(2.5,6.5),calc.multiply(6.5,2.5));

    }


    @Test
    void multiply_divide_test() {

        // floating number (xx.x) * n / n
        double randomDouble = Math.floor((Math.random()*1000-500))/10;
        double tempDouble;
        for (int i = 0; i < RANDOM_ITERATOR_MAX; i++) {
            tempDouble = calc.multiply(randomDouble, i);
            tempDouble = calc.divide(tempDouble, i);
            if (tempDouble != randomDouble) {
                fail("not the same number as before when multiplying and dividing by the same number")
            }
        }

    }


    @Test
    void power_test() {

        // TODO: power test cases

        // normal power calculation

        // power of 1

        // power of 0

        // power of negative numbers

        // power of floating numbers

    }

    @Test
    void square_root_test() {

        // TODO: sqrt test cases

        // normal power calculation

        // power of 1

        // power of 0

        // power of negative numbers

        // power of floating numbers

    }

    @Test
    void n_root_test() {

        // TODO: n root test cases

        // normal power calculation

        // power of 1

        // power of 0

        // power of negative numbers

        // power of floating numbers

    }

}
