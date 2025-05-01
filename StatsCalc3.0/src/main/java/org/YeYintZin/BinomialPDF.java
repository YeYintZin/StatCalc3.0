package org.YeYintZin;

import java.util.List;

public class BinomialPDF extends Calculations {

    public BinomialPDF(List<Double> parameters) {
        super(parameters);
    }

    @Override
    public double calc() {
        Calculations comb = new Combinations(this.getPars());
        Double success = Math.pow(numAt(2), numAt(1));
        Double fail = Math.pow(1 - numAt(2), numAt(0) - numAt(1));
        return comb.calc() * success * fail;
    }

    @Override
    boolean conditions() {
        return false;
    }

    double rawCalc(double num) {
        return 1;
    }

    @Override
    public String process() {
        return "";
    }

    @Override
    public String explain() {
        return "";
    }

    @Override
    public String allCalc() {
        StringBuilder s = new StringBuilder();
        for (Calculations calc : getCalculations()) {
            s.append(calc.process());
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return "The probability of getting " + getPars().get(1).intValue()
                + " successes at " + getPars().get(2) * 100 + "%"
                + " in a total attempt of " + getPars().get(0).intValue()
                + ": " + calc();
    }
}
