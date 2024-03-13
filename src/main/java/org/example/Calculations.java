package org.example;

import org.example.Interfaces.IArithmeticsAdd;
import org.example.Interfaces.IArithmeticsDiff;
import org.example.Interfaces.IArithmeticsDiv;

public class Calculations implements IArithmeticsAdd, IArithmeticsDiff, IArithmeticsDiv {

    @Override
    public double addition(double a, double b) {
        return a + b;
    }
  
    @Override
    public double difference(double A, double B) { return A - B; }
  
    @Override
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
