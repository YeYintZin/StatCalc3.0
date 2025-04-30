package org.YeYintZin;

import java.util.List;

public class Combinations extends Calculations {

    public Combinations(List<Double> parameters) {
        super(parameters);
    }

    @Override
    public Double calc() {
        if (this.getParameters().get(1) == 0) {
            return 1.0;
        }
        Calculations perm = new Permutations(this.getParameters());
        Calculations comb = new Factorial(this.getParameters());
        return (1 / comb.calc(this.getParameters().get(1))) * perm.calc();
    }

    @Override
    Double calc(Double num) {
        return null;
    }

    @Override
    public String process() {
        return "Computes " + this.getParameters().getFirst().intValue()
                + "!" + "\n"
                + "divided by ("
                + this.getParameters().getFirst().intValue() + " - "
                + this.getParameters().get(1).intValue() + ")!"
                + "1 / " + this.getParameters().get(1) + "\n"
                + this.calc();
    }

    @Override
    public String explain() {
        return "nCr" + "\n" +
                "Returns Permutation, the amount of combinations possible, with order mattering\n" +
                "n!/r!(n-r)!";
    }

    @Override
    public String toString() {
        return this.getParameters().getFirst().intValue() + "C" + this.getParameters().get(1).intValue()
                + " = " + calc();
    }
}
