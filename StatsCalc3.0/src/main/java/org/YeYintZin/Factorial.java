package org.YeYintZin;
import java.util.*;

public class Factorial extends Calculations {

    public Factorial(List<Double> parameters) {
        super(parameters);
        setParametersSize(1);
    }

    @Override
    Double calc() {
        Double n = this.getParameters().getFirst();
        for (double i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }

    @Override
    Double calc(Double num) {
        Double n = num;
        for (double i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }

    @Override
    String process() {
        Double n = this.getParameters().getFirst();
        String s = n.toString();
        for (double i = n - 1; i < 1; i++) {
            s += " * " + n;
        }
        return s;
    }

    @Override
    String details() {
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