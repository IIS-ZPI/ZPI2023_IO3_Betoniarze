package org.example;

import org.example.Interfaces.IArithmeticsAdd;

public class Calculations implements IArithmeticsAdd {

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

}
