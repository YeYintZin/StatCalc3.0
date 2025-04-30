package org.YeYintZin;
import java.util.*;

public class Factorial extends Calculations {

    public Factorial(List<Double> parameters) {
        super(parameters);
    }

    @Override
    public double calc() {
        if (numAt(0) == 0) {
            return 1;
        }
        if (numAt(0) % 1 != 0) {
            return -1;
        }
        double n = numAt(0);
        for (double i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }

    @Override
    double calc(Double num) {
        if (num == 0) {
            return 1;
        }
        int n = num.intValue();
        for (int i = n - 1; i > 1; i--) {
            n *= i;
        }
        setRawUse(true);
        getParameters().add(num);
        return n;
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
        double result;
        if (isRawUse()) {
            n = (int) numAt(2);
            result = calc(numAt(2));
        } else {
            n = (int) numAt(0);
            result = calc();
        }
        StringBuilder s = new StringBuilder();
        s.append(n);
        for (int i = n - 1; i > 0; i--) {
            s.append(" * ").append(i);
        }
        return s + " = " + (int) result;
    }

    @Override
    public String allCalc() {
        return process() + "\n";
    }

    @Override
    public String explain() {
        return "n!," +
                " multiplication of n by n - 1, until n - 1 = 1. " +
                "\n" +
                "No implementation of Gamma Function, only Integers.";
    }

    @Override
    public String toString() {
        if (isRawUse()) {
            return numAt(2) + "! = " + calc(numAt(2));
        }
        return numAt(0) + "! = " + calc();
    }
}