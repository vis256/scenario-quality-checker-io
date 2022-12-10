package pl.put.poznan.transformer.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.put.poznan.transformer.rest.ExportController;

import java.util.ArrayList;

public class Scenario {
    private String title;
    private ArrayList<String> actors;
    private String systemActor;
    private ArrayList<Step> steps;

    private static final Logger log = LoggerFactory.getLogger(ExportController.class);

    public Scenario(String title, String systemActor, ArrayList<String> actors, ArrayList<Step> steps) {
        this.title = title;
        this.systemActor = systemActor;
        this.actors = actors;
        this.steps = steps;

        log.debug("Created a Scenario object: " + title);
    }

    public Scenario(String title, String systemActor) {
        this.title = title;
        this.systemActor = systemActor;
        this.actors = null;
        this.steps = null;

        log.debug("Created a Scenario object: " + title);
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

    public void addStep(Step step) {
        this.steps.add(step);
    }

    public void addActor(String actor) {
        this.actors.add(actor);
    }

    public String getSystemActor() { return systemActor; }

    public void setSystemActor(String systemActor) { this.systemActor = systemActor; }
}
