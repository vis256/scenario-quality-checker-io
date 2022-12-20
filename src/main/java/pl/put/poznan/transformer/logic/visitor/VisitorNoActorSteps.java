package pl.put.poznan.transformer.logic.visitor;

import pl.put.poznan.transformer.logic.Scenario;
import pl.put.poznan.transformer.logic.Step;

import java.util.ArrayList;

public class VisitorNoActorSteps implements Visitor {
    private ArrayList<String> actors;
    private String systemActor;
    private ArrayList<String> steps = new ArrayList<>();

    @Override
    public void visit(Scenario scenario) {
        this.actors = scenario.getActors();
        this.systemActor = scenario.getSystemActor();
        for (Step step : scenario.getSteps()) {
            visit(step);
        }
    }

    @Override
    public void visit(Step step) {
        if (step.getSteps().isEmpty()) {
            boolean isOk = false;
            for (String actor : this.actors) {
                if (step.getText().startsWith(actor)) { isOk = true; }
            }
            if (step.getText().startsWith(this.systemActor)) { isOk = true; }
            if (!isOk) { this.steps.add(step.getText()); }
        } else {
            for (Step s : step.getSteps()) {
                visit(s);
            }
        }
    }

    public ArrayList<String> getSteps() {
        return steps;
    }
}
