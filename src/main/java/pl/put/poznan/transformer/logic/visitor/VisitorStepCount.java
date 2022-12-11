package pl.put.poznan.transformer.logic.visitor;

import pl.put.poznan.transformer.logic.Scenario;
import pl.put.poznan.transformer.logic.Step;

/**
 * VisitorStepCount class implements Visitor interface
 * Class counts and returns number of steps in scenario
 */
public class VisitorStepCount implements Visitor {
    private int steps = 0;
    @Override
    public void visit(Scenario scenario) {
        steps++;
    }

    @Override
    public void visit(Step step) {

    }

    public int getStepNumer() {
        return steps;
    }
}
