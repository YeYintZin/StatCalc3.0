package org.YeYintZin;

import java.util.List;

public class Combinations extends Calculations {

    public Combinations(List<Double> parameters) {
        super(parameters);
    }

    @Override
    Double calc() {
        Calculations perm = new Permutations(this.getParameters());
        Calculations comb = new Factorial(this.getParameters());
        return (1 / comb.calc(this.getParameters().get(1))) * perm.calc();
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
        return this.getParameters().getFirst().intValue() + "C" + this.getParameters().get(1).intValue()
                + " = " + calc();
    }
}
