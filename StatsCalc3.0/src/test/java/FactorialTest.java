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
        fac.calc();
        Assertions.assertEquals(120, fac.getResult());
    }

    @Test
    public void testFactorialRawCalc() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        Calculations fac = new Factorial(pars);
        fac.rawCalc(2);
        Assertions.assertEquals(2, fac.getResult());
    }

    @Test
    public void testFactorialCalc0() {
        List<Double> pars = new ArrayList<>();
        pars.add(0.0);
        Calculations fac = new Factorial(pars);
        fac.calc();
        Assertions.assertEquals(1, fac.getResult());
    }

    @Test
    public void testFactorialCalcDecimal() {
        List<Double> pars = new ArrayList<>();
        pars.add(4.2);
        Calculations fac = new Factorial(pars);
        fac.calc();
        Assertions.assertEquals(-1.0, fac.getResult());
    }

    @Test
    public void testFactorialCalcNegative() {
        List<Double> pars = new ArrayList<>();
        pars.add(-40.0);
        Calculations fac = new Factorial(pars);
        fac.calc();
        Assertions.assertEquals(-1.0, fac.getResult());
    }

    @Test
    public void testFactorialProcess() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        Calculations fac = new Factorial(pars);
        String expected = "5 * 4 * 3 * 2 * 1 = 120";
        fac.calc();
        String result = fac.process();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFactorialProcessRaw() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        Calculations fac = new Factorial(pars);
        fac.rawCalc(3);
        String expected = "3 * 2 * 1 = 6";;
        String result = fac.process();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFactorialProcess0() {
        List<Double> pars = new ArrayList<>();
        pars.add(0.0);
        Calculations fac = new Factorial(pars);
        String expected = "0! = 1";
        fac.calc();
        String result = fac.process();
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testFactorialProcessDecimal() {
        List<Double> pars = new ArrayList<>();
        pars.add(4.2);
        Calculations fac = new Factorial(pars);
        fac.calc();
        Assertions.assertEquals("Cannot ! a non natural number.", fac.process());
    }

    @Test
    public void testFactorialProcessNegative() {
        List<Double> pars = new ArrayList<>();
        pars.add(-4.2);
        Calculations fac = new Factorial(pars);
        fac.calc();
        Assertions.assertEquals("Cannot ! a non natural number.", fac.process());
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
        fac.calc();
        String result = fac.explain();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFactorialAllCalc() {
        List<Double> pars = new ArrayList<>();
        pars.add(5.0);
        Calculations fac = new Factorial(pars);
        fac.calc();
        String result = fac.allCalc();
        String expected = fac.process() + "\n";
        Assertions.assertEquals(expected, result);
    }
}
