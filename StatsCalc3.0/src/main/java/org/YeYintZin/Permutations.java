package org.YeYintZin;

import java.util.*;

public class Permutations extends Calculations {

    public Permutations(List<Double> parameters) {
        super(parameters);
    }

    @Override
    Double calc() {
        Calculations numer = new Factorial(this.getParameters());
        FacDifference demon = new FacDifference(this.getParameters());
        this.getCalculations().add(numer);
        this.getCalculations().add(demon);
        return numer.calc() / demon.calc();
    }

    @Override
    String process() {
        return "Computes" + this.getParameters().getFirst().intValue()
                + "!" + "\n"
                + "divides this by "
                + this.getParameters().getFirst().intValue() + "! - "
                + this.getParameters().get(1).intValue() + "!";
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
