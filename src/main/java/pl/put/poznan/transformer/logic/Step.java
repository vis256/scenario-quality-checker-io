package pl.put.poznan.transformer.logic;

import java.io.Serializable;
import java.util.ArrayList;

public class Step implements Serializable {
    private String text;
    private ArrayList<Step> steps;

    public Step(String text) {
        this.text = text;
        this.steps = null;
    }
    public Step(String text, ArrayList<Step> steps) {
        this.text = text;
        this.steps = steps;
    }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }
    public ArrayList<Step> getSteps() { return steps; }

    public void addStep(Step step) { this.steps.add(step); }
}
