package pl.put.poznan.transformer.logic;

import java.util.ArrayList;

public class Scenario implements java.io.Serializable {
    private String title;
    private ArrayList<String> actors;
    private ArrayList<Step> steps;

    public Scenario(String title) {
        this.title = title;
        this.actors = new ArrayList();
        this.steps = new ArrayList();
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<String> getActors() {
        return this.actors;
    }

    public ArrayList<Step> getSteps() {
        return this.steps;
    }
}
