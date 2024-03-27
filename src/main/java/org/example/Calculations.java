package org.example;
import org.example.Interfaces.IArithmeticsAdd;
import org.example.Interfaces.IArithmeticsDiff;
import org.example.Interfaces.IArithmeticsDiv;
import org.example.Interfaces.IArithmeticsMultiply;
import org.example.Interfaces.IArithmeticsPower;

public class Calculations implements IArithmeticsAdd, IArithmeticsDiff, IArithmeticsDiv, IArithmeticsPower, IArithmeticsMultiply {

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    // zad5 komentarz2
    @Override
    public double difference(double A, double B) { return A - B; }
  
    @Override
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }
  
    @Override
    public double power(double a, double b) {
        if(b == 0) return 1.0;
        double exp = b;
        double result = a;
        if(b < 0) exp *= -1;
        for(int i = 0 ; i < exp - 1; i++) {
            result *= a;
        }
        if(b < 0) result = 1 / result;
        return result;
    }
}
