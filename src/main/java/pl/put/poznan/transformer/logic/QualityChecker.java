package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.logic.visitor.VisitorStepCount;

public class QualityChecker {
    private Scenario scenario;

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public Scenario getScenario() {
        return this.scenario;
    }

    public int getStepCount() {
        VisitorStepCount v = new VisitorStepCount();
        scenario.accept(v);
        return v.getStepNumer();
    }
}
