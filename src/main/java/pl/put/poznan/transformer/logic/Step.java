package pl.put.poznan.transformer.logic;

import java.util.ArrayList;

public class Step {
    private String text;
    private ArrayList<Step> steps;

    public Step(String text) {
        this.text = text;
        this.steps = new ArrayList();
    }
}
