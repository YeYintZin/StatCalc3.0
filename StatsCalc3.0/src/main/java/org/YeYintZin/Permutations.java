package org.YeYintZin;

import java.util.*;

public class Permutations extends Calculations {

    public Permutations(List<Double> parameters) {
        super(parameters);
    }

    @Override
    Double calc() {
        Calculations numer = new Factorial(this.getParameters());
        Calculations denom = new Factorial(this.getParameters());
        this.getCalculations().add(numer);
        this.getCalculations().add(denom);
        return numer.calc() / denom.calc(this.getParameters().getFirst() - this.getParameters().get(1));
    }

    @Override
    Double calc(Double num) {
        Calculations numer = new Factorial(this.getParameters());
        Calculations denom = new Factorial(this.getParameters());
        this.getCalculations().add(numer);
        this.getCalculations().add(denom);
        return numer.calc() / denom.calc(this.getParameters().getFirst() - this.getParameters().get(1));
    }

    @Override
    String process() {
        return "Computes " + this.getParameters().getFirst().intValue()
                + "!" + "\n"
                + "divided by ("
                + this.getParameters().getFirst().intValue() + " - "
                + this.getParameters().get(1).intValue() + ")!\n"
                + this.calc();
    }

    @Override
    String details() {
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
