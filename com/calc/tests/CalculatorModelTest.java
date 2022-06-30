package com.calc.tests;

// importing junit stuff
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// importing model to test
import com.calc.src.CalculatorModel;


public class CalculatorModelTest {

    private final CalculatorModel calc = new CalculatorModel();

    @Test
    void add_test() {
        assertEquals(11, calc.add(5,6));
    }

}
