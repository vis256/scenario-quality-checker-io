package pl.put.poznan.transformer.logic.visitor;

import pl.put.poznan.transformer.logic.Scenario;
import pl.put.poznan.transformer.logic.Step;

/**
 * Visitor interface
 * @author Grzegorz Płaczek
 */
public interface Visitor {
    /**
     * Procedure for visiting a Scenario
     * @param scenario scenario to visit
     */
    void visit(Scenario scenario);

    /**
     * Procedure for visiting a Step
     * @param step step to visit
     */
    void visit(Step step);
}
