package pl.edu.wszib;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeClass
    public static void init() throws Exception {
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void positiveSum() {
        int actual = calculator.add(2, 2);
        assertEquals(4, actual);
    }

    @Test
    public void negativeSum() {
        int actual = calculator.add(-3, -5);
        assertEquals(-8, actual);
    }

    @Test
    public void difference() {
        int actual = calculator.difference(5, 2);
        assertEquals(3, actual);
    }

    @Test
    public void multiply() {
        int actual = calculator.multiply(3, 5);
        assertEquals(15, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divide() {
        double actual = calculator.divide(20, 0);
        assertEquals(5, actual, 0.1);
    }




}