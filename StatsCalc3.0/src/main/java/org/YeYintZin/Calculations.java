package org.YeYintZin;
import java.util.*;

public abstract class Calculations {
    private List<Double> parameters;
    private List<Calculations> calculations = new ArrayList<>();
    private boolean rawUse = false;

    public abstract double calc();
    abstract double calc(Double num);
    public abstract String process();
    public abstract String explain();
    public abstract String allCalc();

    public Calculations(List<Double> parameters) {
        this.parameters = parameters;
    }

    public double numAt(int idx) {
        return parameters.get(idx);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Calculations that = (Calculations) o;
        return Objects.equals(parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters);
    }

    public List<Double> getParameters() {
        return parameters;
    }

    public void setParameters(List<Double> parameters) {
        this.parameters = parameters;
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
}
