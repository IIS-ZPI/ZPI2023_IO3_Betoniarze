package org.example;

import org.example.Interfaces.IArithmeticsAdd;
import org.example.Interfaces.IArithmeticsDiff;

public class Calculations implements IArithmeticsAdd, IArithmeticsDiff {

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double difference(double A, double B) { return A - B; }
}
