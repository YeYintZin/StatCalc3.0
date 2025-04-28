package org.YeYintZin;

import java.util.List;

public class FacDifference extends Factorial {

    public FacDifference(List<Double> parameters) {
        super(parameters);
    }

    @Override
    Double calc() {
        Double n = this.getParameters().getFirst() - this.getParameters().get(1);
        for (double i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }

    @Override
    public String toString() {
        return this.getParameters().getFirst().intValue() - getParameters().get(1).intValue() + "! = " + calc();
    }
}
