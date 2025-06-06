package org.YeYintZin;

import java.util.List;

public class Permutations extends Calculation {

    public Permutations(List<Double> parameters) {
        super(parameters);
    }

    /**
     * Calculations Permutation, nPr,
     * the amount of combinations possible, with order mattering,
     * the 1st value of pars permuting the 2nd.
     */
    @Override
    public void calc() {
        if (numAt(0) == 0) {
            setResult(0);
            return;
    }
        if (isValid()) {
            setResult(-1);
            return;
        }
        Calculation numerator = new Factorial(getPars());
        numerator.calc();
        Calculation denominator = new Factorial(getPars());
        denominator.rawCalc(numAt(0) - numAt(1));
        getCalculation().add(numerator);
        getCalculation().add(denominator);
        setResult(numerator.getResult() / denominator.getResult());
    }

    @Override
    boolean isValid() {
        return numAt(0) < 0 ||
                numAt(0) % 1 != 0 ||
                numAt(1) < 0 ||
                numAt(1) % 1 != 0;
    }

    // TODO
    @Override
    public void rawCalc(double num) {
        return;
    }

    /**
     * Displays the step-by-step mathematical process to obtain Permutation.
     * @return String of steps
     */
    @Override
    public String process() {
        if (isValid() || numAt(0) == 0) {
            return "Error. Cannot calculate factorial of a non natural number.";
        }
        return "Computes "
                + (int) numAt(0) + "! " + "divided by ("
                + this.getPars().getFirst().intValue() + " - "
                + (int) numAt(1) + ")! = "
                + (int) getResult();
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
            s.append(getCalculation().get(i).process());
            s.append("\n");
        }
        s.append(process());
        return s.toString();
    }

    @Override
    public String toString() {
        return numAt(0) + "P" + numAt(1)
                + " = " + getResult();
    }
}
