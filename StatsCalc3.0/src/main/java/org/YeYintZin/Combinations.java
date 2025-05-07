package org.YeYintZin;

import java.util.List;

public class Combinations extends Calculations {

    public Combinations(List<Double> parameters) {
        super(parameters);
    }

    /**
     * Calculates Combinations, the 1st value of pars combining the 2nd.
     * @return nCr, the amount of combinations, with order not mattering.
     */
    @Override
    public void calc() {
        if (conditions()) {
            setResult(-1);
            return;
        }
        Calculations perm = new Permutations(getPars());
        perm.calc();
        Calculations comb = new Factorial(getPars());
        comb.rawCalc(numAt(1));
        getCalculations().add(perm);
        getCalculations().add(comb);
        setResult((1 / comb.getResult()) * perm.getResult());
    }

    @Override
    boolean conditions() {
        return numAt(0) < 0 ||
                numAt(1) < 0 ||
                numAt(0) % 1 != 0 ||
                numAt(1) % 1 != 0;
    }

    public void rawCalc(double num) {
        return;
    }

    /**
     * Displays the step-by-step mathematical process for Combinations.
     * @return String of steps
     */
    @Override
    public String process() {
        return "Computes " + numAt(0)
                + "! divided by ("
                + numAt(0) + " - "
                + numAt(1) + ")!" + "\n"
                + "1 / " + numAt(1) + "! = "
                + getResult();
    }

    @Override
    public String explain() {
        return "nCr" + "\n" +
                "Returns Combinations, the amount of combinations possible, without order mattering\n" +
                "n!/r!(n-r)!";
    }

    /**
     * Show all processes
     * @return process()
     */
    @Override
    public String allCalc() {
        StringBuilder s = new StringBuilder();
        s.append("Full process: " + "\n");
        for (int i = 0; i < 3; i++) {
            s.append(getCalculations().get(i).process());
            s.append("\n");
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return numAt(0) + "C" + numAt(1)
                + " = " + getResult();
    }
}
