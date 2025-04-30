package org.YeYintZin;
import java.util.*;

public class Factorial extends Calculations {

    public Factorial(List<Double> parameters) {
        super(parameters);
    }

    @Override
    public Double calc() {
        if (numAt(0) == 0) {
            return 1.0;
        }
        if (numAt(0) % 1 != 0) {
            return -1.0;
        }
        int n = numAt(0).intValue();
        for (int i = n - 1; i > 1; i--) {
            n *= i;
        }
        return (double) n;
    }

    @Override
    Double calc(Double num) {
        if (num == 0) {
            return 1.0;
        }
        int n = num.intValue();
        for (int i = n - 1; i > 1; i--) {
            n *= i;
        }
        setRawUse(true);
        getParameters().add(num);
        return (double) n;
    }

    @Override
    public String process() {
        if (calc() == 1) {
            return "0! = 1";
        }
        if (calc() == -1) {
            return "Cannot ! a non integer.";
        }
        int n;
        if (isRawUse()) {
            n = numAt(2).intValue();
        } else {
            n = numAt(0).intValue();
        }
        String s = Integer.toString(n);
        for (int i = n - 1; i > 0; i--) {
            s += " * " + i;
        }
        return s;
    }

    @Override
    public String explain() {
        return "n!" + "\n" +
                "Multiplies n by n - 1, until n - 1 = 1. " +
                "\n" +
                "No implementation of Gamma Function, only Integers.";
    }

    @Override
    public String toString() {
        if (isRawUse()) {
            return numAt(2).intValue() + "! = " + calc(numAt(2));
        }
        return numAt(0).intValue() + "! = " + calc();
    }
}