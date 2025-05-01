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
        Assertions.assertEquals(20, perm.calc());
    }

    @Test
    public void testPermutationsCalc_nP0() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(0.0);
        Calculations perm = new Permutations(pars);
        Assertions.assertEquals(1, perm.calc());
    }

    @Test
    public void testPermutationsCalc_0Pr() {
        List<Double> pars = new ArrayList<>();
        pars.add(0.0);
        pars.add(5.0);
        Calculations perm = new Permutations(pars);
        Assertions.assertEquals(0, perm.calc());
    }

    @Test
    public void testPermutationsCalcNegative() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(-2.0);
        Calculations perm = new Permutations(pars);
        Assertions.assertEquals(-1, perm.calc());
    }

    @Test
    public void testPermutationsDecimal() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.2);
        pars.add(2.0);
        Calculations perm = new Permutations(pars);
        Assertions.assertEquals(-1, perm.calc());
    }

}
