package org.YeYintZin;

import java.util.List;

public class BinomialPDF extends Calculations {

    public BinomialPDF(List<Double> parameters) {
        super(parameters);
    }

    @Override
    public void calc() {
        Calculations comb = new Combinations(this.getPars());
        Double success = Math.pow(numAt(2), numAt(1));
        Double fail = Math.pow(1 - numAt(2), numAt(0) - numAt(1));
        setResult(comb.getResult() * success * fail);
    }

    @Override
    boolean conditions() {
        return false;
    }

    public void rawCalc(double num) {
        return;
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
        return "The probability of getting " + (int) numAt(1)
                + " successes at " + (int) numAt(2) * 100 + "%"
                + " in a total attempt of " + (int) numAt(0)
                + ": " + getResult();
    }
}
