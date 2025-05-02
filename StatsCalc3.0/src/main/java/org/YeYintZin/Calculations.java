package org.YeYintZin;
import java.util.*;

public abstract class Calculations {
    private List<Double> pars;
    private List<Calculations> calculations = new ArrayList<>();
    private boolean rawUse = false;
    private double result;

    public abstract void calc();
    // TODO
    public abstract void rawCalc(double num);
    abstract boolean conditions();
    public abstract String process();
    public abstract String explain();
    public abstract String allCalc();

    public Calculations(List<Double> parameters) {
        this.pars = parameters;
    }

    /**
     * Finds a value in parameters
     * @param idx The index
     * @return The value at the index
     */
    public double numAt(int idx) {
        return pars.get(idx);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Calculations that = (Calculations) o;
        return Objects.equals(pars, that.pars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pars);
    }

    public List<Double> getPars() {
        return pars;
    }

    public void setPars(List<Double> pars) {
        this.pars = pars;
    }

    public List<Calculations> getCalculations() {
        return calculations;
    }

    public void setCalculations(List<Calculations> calculations) {
        this.calculations = calculations;
    }

    public boolean isRawUse() {
        return rawUse;
    }

    public void setRawUse(boolean rawUse) {
        this.rawUse = rawUse;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
