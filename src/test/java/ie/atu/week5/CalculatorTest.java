package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator myCalculator;

    @BeforeEach
    void setUp() {
        myCalculator = new Calculator();
    }

    @Test
    void testAdd(){
        assertEquals(10, myCalculator.add(5,5));
    }

    @Test
    void testSubtract(){
        assertEquals(10, myCalculator.subtract(20,10));
    }

    @Test
    void testMultiply(){
        assertEquals(10, myCalculator.multiply(2,5));
    }

    @AfterEach
    void tearDown() {
    }
}