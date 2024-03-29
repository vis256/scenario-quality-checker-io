package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.logic.visitor.Visitor;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class holding step info in scenarios
 * @author Grzegorz Płaczek
 */
public class Step implements Serializable {
    private String text;
    private ArrayList<Step> steps;

    /**
     * Creates a Step instance leaving steps list as a null
     * @param text step description
     */
    public Step(String text) {
        this.text = text;
        this.steps = new ArrayList<>();
    }

    /**
     * Creates a complete Step instance
     * @param text step description
     * @param steps substeps list
     */
    public Step(String text, ArrayList<Step> steps) {
        this.text = text;
        this.steps = steps;
    }

    /**
     * Getter for text
     * @return text
     */
    public String getText() { return text; }

    /**
     * Setter for text
     * @param text text to set
     */
    public void setText(String text) { this.text = text; }

    /**
     * Getter for steps
     * @return steps ArrayList
     */
    public ArrayList<Step> getSteps() {
        if (this.steps != null) {
            return this.steps;
        } else {
            return new ArrayList<>();
        }
    }

    /**
     * Adds a step to the steps ArrayList
     * @param step step to add to the steps ArrayList
     */
    public void addStep(Step step) { this.steps.add(step); }

    /**
     * Accepts a Visitor and allows it to visit and process Step data
     * @param visitor
     */
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
