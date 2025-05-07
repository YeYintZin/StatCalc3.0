package org.YeYintZin;
import java.util.*;

public abstract class Calculation {
    protected List<Double> pars;
    protected List<Calculation> calculations = new ArrayList<>();
    protected boolean rawUse = false;
    protected double result;

    public abstract void calc();
    // TODO: MERGE THE CALCS
    public abstract void rawCalc(double num);
    abstract boolean isValid();
    public abstract String process();
    public abstract String explain();
    public abstract String allCalc();

    public Calculation(List<Double> parameters) {
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
        Calculation that = (Calculation) o;
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

    public List<Calculation> getCalculation() {
        return calculations;
    }

    public void setCalculation(List<Calculation> Calculation) {
        this.calculations = Calculation;
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
