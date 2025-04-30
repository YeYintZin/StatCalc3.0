package org.YeYintZin;

import java.util.*;

public class Permutations extends Calculations {

    public Permutations(List<Double> parameters) {
        super(parameters);
    }

    @Override
    public Double calc() {
        Calculations numer = new Factorial(this.getParameters());
        Calculations denom = new Factorial(this.getParameters());
        this.getCalculations().add(numer);
        this.getCalculations().add(denom);
        return numer.calc() / denom.calc(numAt(0) - numAt(1));
    }

    @Override
    Double calc(Double num) {
        return null;
    }

    @Override
    public String process() {
        return "Computes "
                + numAt(0).intValue() + "! " + "divided by ("
                + this.getParameters().getFirst().intValue() + " - "
                + numAt(1).intValue() + ")! = "
                + this.calc();
    }

    @Override
    public String explain() {
        return "nPr" + "\n" +
                "Returns Permutation, the amount of combinations possible, without order mattering\n" +
                "n!/(n-r)!";
    }

    @Override
    public String toString() {
        return this.getParameters().getFirst().intValue() + "P" + this.getParameters().get(1).intValue()
                + " = " + calc();
    }
}
