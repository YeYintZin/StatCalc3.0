package org.YeYintZin;

import java.util.List;

public class BinomialPDF extends Calculations {

    public BinomialPDF(List<Double> parameters) {
        super(parameters);
    }

    @Override
    Double calc() {
        Calculations comb = new Combinations(this.getParameters());
        Double success = Math.pow(this.getParameters().get(2), this.getParameters().get(1));
        Double fail = Math.pow(1 - this.getParameters().get(2), this.getParameters().getFirst() - this.getParameters().get(1));
        return comb.calc() * success * fail;
    }

    @Override
    Double calc(Double num) {
        return 0.0;
    }

    @Override
    String process() {
        return "";
    }

    @Override
    String details() {
        return "";
    }

    @Override
    public String toString() {
        return "The probability of getting " + getParameters().get(1).intValue()
                + " successes at " + getParameters().get(2) * 100 + "%"
                + " in a total attempt of " + getParameters().get(0).intValue()
                + ": " + calc();
    }
}
