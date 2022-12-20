package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.logic.visitor.VisitorNoActorSteps;
import pl.put.poznan.transformer.logic.visitor.VisitorStepCount;

import java.util.ArrayList;

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
        v.visit( this.scenario );
        return v.getStepNumer();
    }

    public ArrayList<String> getNoActorSteps() {
        VisitorNoActorSteps v = new VisitorNoActorSteps();
        v.visit(this.scenario);
        return v.getSteps();
    }
}
