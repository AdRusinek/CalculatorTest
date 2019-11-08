package pl.edu.wszib;

/**
 * Created by Adrian Rusinek on 25.10.2019
 **/
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int difference(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return ((double) a) / ((double) b);
    }
}
