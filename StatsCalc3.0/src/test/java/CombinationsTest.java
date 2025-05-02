import org.YeYintZin.Calculations;
import org.YeYintZin.Combinations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CombinationsTest {
    @Test
    public void testCombinationsCalc() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(2.0);
        Calculations combinations = new Combinations(pars);
        Assertions.assertEquals(10, combinations.getResult());
    }

    @Test
    public void testCombinationsCalc_nP0() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(0.0);
        Calculations combinations = new Combinations(pars);
        Assertions.assertEquals(1, combinations.getResult());
    }

    @Test
    public void testCombinationsCalc_0Pr() {
        List<Double> pars = new ArrayList<>();
        pars.add(0.0);
        pars.add(1.0);
        Calculations combinations = new Combinations(pars);
        Assertions.assertEquals(0, combinations.getResult());
    }

    @Test
    public void testCombinationsCalcDecimal() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.1);
        pars.add(2.0);
        Calculations combinations = new Combinations(pars);
        Assertions.assertEquals(-1, combinations.getResult());
    }

    @Test
    public void testCombinationsCalcNegative() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(-2.0);
        Calculations combinations = new Combinations(pars);
        Assertions.assertEquals(-1, combinations.getResult());
    }
}
