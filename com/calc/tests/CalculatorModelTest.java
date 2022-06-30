package com.calc.tests;

// importing junit stuff
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// importing model to test
import com.calc.src.CalculatorModel;


class CalculatorModelTest {

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
        for (int i = 0; i < 25; i++) {
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
        for (int i = 0; i < 25; i++) {
            randomDouble1 = (Math.floor((Math.random()*1000-500))/10);
            randomDouble2 = (Math.floor((Math.random()*1000-500))/10);
            assertEquals((randomDouble1*10 - randomDouble2*10)/10,
                    calc.substract(randomDouble1, randomDouble2));
        }

    }
}
