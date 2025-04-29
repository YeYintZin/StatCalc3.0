package org.YeYintZin;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        Calculations fac = new Factorial(pars);
        System.out.println(fac.process());
    }
}