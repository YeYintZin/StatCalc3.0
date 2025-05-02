import org.YeYintZin.Calculations;
import org.YeYintZin.Permutations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class PermutationsTest {
    @Test
    public void testPermutationsCalc() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(2.0);
        Calculations perm = new Permutations(pars);
        perm.calc();
        Assertions.assertEquals(20, perm.getResult());
    }

    @Test
    public void testPermutationsCalc_nP0() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(0.0);
        Calculations perm = new Permutations(pars);
        perm.calc();
        Assertions.assertEquals(1, perm.getResult());
    }

    @Test
    public void testPermutationsCalc_0Pr() {
        List<Double> pars = new ArrayList<>();
        pars.add(0.0);
        pars.add(5.0);
        Calculations perm = new Permutations(pars);
        perm.calc();
        Assertions.assertEquals(0, perm.getResult());
    }

    @Test
    public void testPermutationsCalcNegative() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(-2.0);
        Calculations perm = new Permutations(pars);
        perm.calc();
        Assertions.assertEquals(-1, perm.getResult());
    }

    @Test
    public void testPermutationsDecimal() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.2);
        pars.add(2.0);
        Calculations perm = new Permutations(pars);
        perm.calc();
        Assertions.assertEquals(-1, perm.getResult());
    }


    @Test
    public void testPermutationsProcess() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(2.0);
        Calculations perm = new Permutations(pars);
        String expected = "Computes 5! divided by (5 - 2)! = 20";
        perm.calc();
        Assertions.assertEquals(expected, perm.process());
    }

    @Test
    public void testPermutationsProcess_nP0() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(0.0);
        Calculations perm = new Permutations(pars);
        String expected = "Computes 5! divided by (5 - 0)! = 1";
        perm.calc();
        Assertions.assertEquals(expected, perm.process());
    }

    @Test
    public void testPermutationsProcess_0Pr() {
        List<Double> pars = new ArrayList<>();
        pars.add(0.0);
        pars.add(2.0);
        Calculations perm = new Permutations(pars);
        String expected = "Error. Cannot calculate factorial of a non natural number.";
        perm.calc();
        Assertions.assertEquals(expected, perm.process());
    }

    @Test
    public void testPermutationsProcessNegative() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(-2.0);
        Calculations perm = new Permutations(pars);
        String expected = "Error. Cannot calculate factorial of a non natural number.";
        Assertions.assertEquals(expected, perm.process());
    }

    @Test
    public void testPermutationsProcess_NP0() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(2.2);
        Calculations perm = new Permutations(pars);
        String expected = "Error. Cannot calculate factorial of a non natural number.";
        Assertions.assertEquals(expected, perm.process());
    }

    @Test
    public void testPermutationsExplain() {
        List<Double> pars = new ArrayList<>();
        Calculations perm = new Permutations(pars);
        String expected = "nPr: returns Permutation, the amount of combinations possible, " +
                "with order mattering\n" +
                "n!/(n-r)!";
        Assertions.assertEquals(expected, perm.explain());
    }

    @Test
    public void testPermutationsAllCalc() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(3.0);
        Calculations perm = new Permutations(pars);
        perm.calc();
        String expected = "Full process: \n" +
                "5 * 4 * 3 * 2 * 1 = 120\n" +
                "3 * 2 * 1 = 6\n" +
                "Computes 5! divided by (5 - 3)! = 60";
        Assertions.assertEquals(expected, perm.allCalc());
    }
}
