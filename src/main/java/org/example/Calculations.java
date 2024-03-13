package org.example;

import org.example.Interfaces.IArithmeticsMultiply;

public class Calculations implements IArithmeticsMultiply {

    @Override
    public double Multiplication(double A, double B) {
        return A * B;
    }
}