package org.YeYintZin;
import java.util.*;

public class Factorial extends Calculations {

    public Factorial(List<Double> parameters) {
        super(parameters);
        setParametersSize(1);
    }

    @Override
    public Double calc() {
        if (this.getParameters().getFirst() == 0.0) {
            return 1.0;
        }
        Double n = this.getParameters().getFirst();
        for (double i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }

    @Override
    Double calc(Double num) {
        if (num == 0) {
            return 1.0;
        }
        Double n = num;
        for (double i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }

    @Override
    public String process() {
        if (calc() == 1) {
            return "0! = 1";
        }
        Integer n = this.getParameters().getFirst().intValue();
        String s = n.toString();
        for (int i = n - 1; i > 0; i--) {
            s += " * " + i;
        }
        return s;
    }

    @Override
    public String details() {
        return "n!" + "\n" +
                "Multiplies n by n - 1, until n - 1 = 1. " +
                "\n" +
                "No implementation of Gamma Function, only Integers.";
    }

    @Override
    public String toString() {
        return this.getParameters().getFirst().intValue() + "! = " + calc();
    }
}