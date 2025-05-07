import org.YeYintZin.BinomialPDF;
import org.YeYintZin.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

import java.util.ArrayList;

public class BinomialPDFTest {

    @Test
    public void calcTest() {
        List<Double> pars = new ArrayList<>();
        pars.add(10.0);
        pars.add(2.0);
        pars.add(0.3);
        Calculation bpdf = new BinomialPDF(pars);
        bpdf.calc();
        Assertions.assertEquals(0.23347444049999988, bpdf.getResult());
    }

    @Test
    public void calcTest0Attempts() {
        List<Double> pars = new ArrayList<>();
        pars.add(0.0);
        pars.add(0.0);
        pars.add(0.3);
        Calculation bpdf = new BinomialPDF(pars);
        bpdf.calc();
        Assertions.assertEquals(0, bpdf.getResult());
    }

    @Test
    public void calcTestNegativeAttempts() {
        List<Double> pars = new ArrayList<>();
        pars.add(-10.0);
        pars.add(-10.0);
        pars.add(0.3);
        Calculation bpdf = new BinomialPDF(pars);
        bpdf.calc();
        Assertions.assertEquals(-1, bpdf.getResult());
    }

    @Test
    public void calcTestDecimalAttempts() {
        List<Double> pars = new ArrayList<>();
        pars.add(10.1);
        pars.add(2.0);
        pars.add(0.3);
        Calculation bpdf = new BinomialPDF(pars);
        bpdf.calc();
        Assertions.assertEquals(-1, bpdf.getResult());
    }

    @Test
    public void calcTestDecimalSuccesses() {
        List<Double> pars = new ArrayList<>();
        pars.add(10.0);
        pars.add(2.1);
        pars.add(0.3);
        Calculation bpdf = new BinomialPDF(pars);
        bpdf.calc();
        Assertions.assertEquals(-1, bpdf.getResult());
    }

    @Test
    public void calcTestNegativeSuccesses() {
        List<Double> pars = new ArrayList<>();
        pars.add(10.0);
        pars.add(-2.0);
        pars.add(0.3);
        Calculation bpdf = new BinomialPDF(pars);
        bpdf.calc();
        Assertions.assertEquals(-1, bpdf.getResult());
    }

    @Test
    public void calcTestExtraSuccesses() {
        List<Double> pars = new ArrayList<>();
        pars.add(2.0);
        pars.add(10.0);
        pars.add(0.3);
        Calculation bpdf = new BinomialPDF(pars);
        bpdf.calc();
        Assertions.assertEquals(-1, bpdf.getResult());
    }

    @Test
    public void calcTestOverGaranteed() {
        List<Double> pars = new ArrayList<>();
        pars.add(10.0);
        pars.add(2.0);
        pars.add(1.4);
        Calculation bpdf = new BinomialPDF(pars);
        bpdf.calc();
        Assertions.assertEquals(-1, bpdf.getResult());
    }

    @Test
    public void calcTestBelowImpossible() {
        List<Double> pars = new ArrayList<>();
        pars.add(10.0);
        pars.add(2.0);
        pars.add(-0.02);
        Calculation bpdf = new BinomialPDF(pars);
        bpdf.calc();
        Assertions.assertEquals(-1, bpdf.getResult());
    }

}
