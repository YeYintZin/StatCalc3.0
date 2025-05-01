package org.YeYintZin;

import java.util.List;

public class Permutations extends Calculations {

    public Permutations(List<Double> parameters) {
        super(parameters);
    }

    /**
     * Calculations Permutation, the 1st value of pars permuting the 2nd.
     * @return nPr, the amount of combinations possible, with order mattering.
     */
    @Override
    public double calc() {
        if (conditions()) {
            return -1;
        }
        if (numAt(0) == 0) {
            return 0;
        }
        Calculations numerator = new Factorial(getPars());
        getCalculations().add(numerator);
        return numerator.calc() / numerator.rawCalc(numAt(0) - numAt(1));
    }

    @Override
    boolean conditions() {
        return numAt(0) < 0 ||
                numAt(0) % 1 != 0 ||
                numAt(1) < 0 ||
                numAt(1) % 1 != 0;
    }

    // TODO
    @Override
    double rawCalc(double num) {
        return -1;
    }

    /**
     * Displays the step-by-step mathematical process to obtain Permutation.
     * @return String of steps
     */
    @Override
    public String process() {
        return "Computes "
                + numAt(0) + "! " + "divided by ("
                + this.getPars().getFirst().intValue() + " - "
                + numAt(1) + ")! = "
                + this.calc();
    }

    /**
     * Explains what is Permutations
     * @return Explanation
     */
    @Override
    public String explain() {
        return "nPr: " +
                "returns Permutation, the amount of combinations possible, with order mattering\n" +
                "n!/(n-r)!";
    }

    /**
     * Show all processes
     * @return All process()
     */
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
