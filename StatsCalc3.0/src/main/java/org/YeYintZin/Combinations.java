package org.YeYintZin;

import java.util.List;

public class Combinations extends Calculations {

    public Combinations(List<Double> parameters) {
        super(parameters);
    }

    @Override
    public double calc() {
        if (numAt(1) == 0) {
            return 1.0;
        }
        Calculations perm = new Permutations(this.getParameters());
        Calculations comb = new Factorial(this.getParameters());
        getCalculations().add(perm);
        getCalculations().add(comb);
        return (1 / comb.calc(numAt(1))) * perm.calc();
    }

    @Override
    double calc(Double num) {
        return -1;
    }

    @Override
    public String process() {
        return "Computes " + numAt(0)
                + "! divided by ("
                + numAt(0) + " - "
                + numAt(1) + ")!" + "\n"
                + "1 / " + numAt(1) + "! = "
                + calc();
    }

    @Override
    public String explain() {
        return "nCr" + "\n" +
                "Returns Combinations, the amount of combinations possible, with order mattering\n" +
                "n!/r!(n-r)!";
    }

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
        return numAt(0) + "C" + numAt(1)
                + " = " + calc();
    }
}
