package org.example;

import org.example.Interfaces.*;

public class Calculations implements IArithmeticsAdd, IArithmeticsDiff, IArithmeticsDiv, IArithmeticsPower, IArithmeticsMultiply {

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double difference(double A, double B) {
        return A - B;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero");

        return a / b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

}
