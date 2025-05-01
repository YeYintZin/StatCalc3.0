package org.YeYintZin;
import java.util.*;

public class Factorial extends Calculations {

    public Factorial(List<Double> pars) {
        super(pars);
    }

    /**
     * Calculates the factorial of an integer, it being the first value in parameters
     * @return n!
     */
    @Override
    public double calc() {
        if (numAt(0) == 0) {
            return 1;
        }
        if (conditions()) {
            return -1;
        }
        double result = numAt(0);
        for (double i = result - 1; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    @Override
    boolean conditions() {
        return numAt(0) < 0 || numAt(0) % 1 != 0;
    }

    /**
     * Uses calc() but with a parameter instead of the field pars
     * @param num The parameter
     * @return num!
     */
    @Override
    double rawCalc(double num) {
        if (num == 0) {
            return 1;
        }
        if (conditions()) {
            return -1;
        }
        int result = (int) num;
        for (int i = result - 1; i > 1; i--) {
            result *= i;
        }
        setRawUse(true);
        getPars().add(num);
        return result;
    }

    /**
     * Displays the step-by-step mathematical process to obtain factorial.
     * @return String of steps
     */
    @Override
    public String process() {
        if (calc() == 1) {
            return "0! = 1";
        }
        if (calc() == -1) {
            return "Cannot ! a non natural number.";
        }
        int num;
        double result;
        if (isRawUse()) {
            num = (int) numAt(2);
            result = rawCalc(numAt(2));
        } else {
            num = (int) numAt(0);
            result = calc();
        }
        StringBuilder s = new StringBuilder();
        s.append(num);
        for (int i = num - 1; i > 0; i--) {
            s.append(" * ").append(i);
        }
        return s + " = " + (int) result;
    }

    /**
     * Explains what is factorial.
     * @return Explanation.
     */
    @Override
    public String explain() {
        return "n!," +
                " multiplication of n by n - 1, until n - 1 = 1. " +
                "\n" +
                "No implementation of Gamma Function, only Integers.";
    }

    /**
     * Shows all processes. Since factorial is a simple calculation, it only has one process()
     * @return process()
     */
    @Override
    public String allCalc() {
        return process() + "\n";
    }

    @Override
    public String toString() {
        if (isRawUse()) {
            return numAt(2) + "! = " + rawCalc(numAt(2));
        }
        return numAt(0) + "! = " + calc();
    }
}