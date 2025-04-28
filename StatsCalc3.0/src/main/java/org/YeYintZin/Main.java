package org.YeYintZin;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> pars1 = new ArrayList<>();
        pars1.add(10.0);
        pars1.add(0.0);
        pars1.add(0.6);
        List<Double> pars2 = new ArrayList<>();
        pars2.add(10.0);
        pars2.add(0.0);
        Calculations perm = new Combinations(pars2);
        System.out.println(perm);
        Calculations binomPDF = new BinomialPDF(pars1);
        System.out.println(binomPDF);
    }
}