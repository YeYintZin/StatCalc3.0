import org.YeYintZin.Calculations;
import org.YeYintZin.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class FactorialTest {

    @Test
    public void testFactorialCalc() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        Calculations fac = new Factorial(pars);
        Assertions.assertEquals(120, (double) fac.calc());
    }

    @Test
    public void testFactorialCalc0() {
        List<Double> pars = new ArrayList<>();
        pars.add(0.0);
        Calculations fac = new Factorial(pars);
        Assertions.assertEquals(1, fac.calc());
    }

    @Test
    public void testFactorialDecimal() {
        List<Double> pars = new ArrayList<>();
        pars.add(4.2);
        Calculations fac = new Factorial(pars);
        Assertions.assertEquals(-1.0, fac.calc());
    }

    @Test
    public void testFactorialDecimalProcess() {
        List<Double> pars = new ArrayList<>();
        pars.add(4.2);
        Calculations fac = new Factorial(pars);
        Assertions.assertEquals("Cannot ! a non integer.", fac.process());
    }

    @Test
    public void testFactorialProcess() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        Calculations fac = new Factorial(pars);
        String expected = "5 * 4 * 3 * 2 * 1 = 120";
        String result = fac.process();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFactorialDetails() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        Calculations fac = new Factorial(pars);
        String expected = "n!" +
                ", multiplication of n by n - 1, until n - 1 = 1. " +
                "\n" +
                "No implementation of Gamma Function, only Integers.";
        String result = fac.explain();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFactorialallCalc() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        pars.add(2.0);
        Calculations fac = new Factorial(pars);
        String result = fac.allCalc();
        String expected = fac.process() + "\n";
        Assertions.assertEquals(expected, result);
    }
}