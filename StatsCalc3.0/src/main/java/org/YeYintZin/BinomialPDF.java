package org.YeYintZin;

import java.util.List;

public class BinomialPDF extends Calculation {

    public BinomialPDF(List<Double> parameters) {
        super(parameters);
    }

    @Override
    public void calc() {
        if (isValid()) {
            setResult(-1);
            return;
        }
        Calculation comb = new Combinations(getPars());
        comb.calc();
        double success = Math.pow(numAt(2), numAt(1));
        double fail = Math.pow(1 - numAt(2), numAt(0) - numAt(1));
        setResult(comb.getResult() * success * fail);
    }

    @Override
    boolean isValid() {
        return
                numAt(0) % 1 != 0 ||
                numAt(0) < 0 ||
                numAt(1) < 0 ||
                numAt(1) % 1 != 0 ||
                numAt(1) > numAt(0) ||
                numAt(2) > 1 ||
                numAt(2) < 0;
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
        for (Calculation calc : getCalculation()) {
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
