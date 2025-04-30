package org.YeYintZin;

import java.util.*;

public class Permutations extends Calculations {

    public Permutations(List<Double> parameters) {
        super(parameters);
    }

    @Override
    public double calc() {
        Calculations numer = new Factorial(getParameters());
        Calculations denom = new Factorial(getParameters());
        getCalculations().add(numer);
        getCalculations().add(denom);
        return numer.calc() / denom.calc(numAt(0) - numAt(1));
    }

    @Override
    double calc(Double num) {
        return -1;
    }

    @Override
    public String process() {
        return "Computes "
                + numAt(0) + "! " + "divided by ("
                + this.getParameters().getFirst().intValue() + " - "
                + numAt(1) + ")! = "
                + this.calc();
    }

    @Override
    public String explain() {
        return "nPr: " +
                "returns Permutation, the amount of combinations possible, without order mattering\n" +
                "n!/(n-r)!";
    }

    @Override
    public String allCalc() {
        StringBuilder s = new StringBuilder();
        s.append("Full process: " + "\n");
        for (int i = 0; i < 2; i++) {
            s.append(getCalculations().get(i).process());
            s.append("\n");
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return numAt(0) + "P" + numAt(1)
                + " = " + calc();
    }
}
