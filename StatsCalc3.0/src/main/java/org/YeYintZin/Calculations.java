package org.YeYintZin;
import java.util.*;

public abstract class Calculations {
    private List<Double> parameters;
    private Integer parametersSize;
    private List<Calculations> calculations = new ArrayList<>();

    abstract Double calc();
    abstract Double calc(Double num);
    abstract String process();
    abstract String details();

    public Calculations(List<Double> parameters) {
        this.parameters = parameters;
        this.parametersSize = parameters.size();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Calculations that = (Calculations) o;
        return Objects.equals(parameters, that.parameters) && Objects.equals(parametersSize, that.parametersSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, parametersSize);
    }

    public List<Double> getParameters() {
        return parameters;
    }

    public void setParameters(List<Double> parameters) {
        this.parameters = parameters;
    }

    public Integer getParametersSize() {
        return parametersSize;
    }

    public void setParametersSize(Integer parametersSize) {
        this.parametersSize = parametersSize;
    }

    public List<Calculations> getCalculations() {
        return calculations;
    }

    public void setCalculations(List<Calculations> calculations) {
        this.calculations = calculations;
    }
}
