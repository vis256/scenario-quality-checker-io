package pl.put.poznan.transformer.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.put.poznan.transformer.logic.visitor.Visitor;
import pl.put.poznan.transformer.rest.ExportController;

import java.util.ArrayList;

/**
 * Class holding scenario instances
 * @author Grzegorz Płaczek
 */
public class Scenario {
    private String title;
    private ArrayList<String> actors;
    private String systemActor;
    private ArrayList<Step> steps;
    
    private static final Logger log = LoggerFactory.getLogger(ExportController.class);

    /**
     * Creates a complete Scenario instance
     * @param title scenario title
     * @param systemActor system actor
     * @param actors list of actors
     * @param steps list of steps
     */

    public Scenario(String title, String systemActor, ArrayList<String> actors, ArrayList<Step> steps) {
        this.title = title;
        this.systemActor = systemActor;
        this.actors = actors;
        this.steps = steps;

        log.debug("Created a Scenario object: " + title);
    }

    /**
     * Creates Scenario instance with a title and system actor, leaving actors and steps lists as nulls
     * @param title scenario title
     * @param systemActor system actor
     */
    public Scenario(String title, String systemActor) {
        this.title = title;
        this.systemActor = systemActor;
        this.actors = null;
        this.steps = null;

        log.debug("Created a Scenario object: " + title);
    }

    /**
     * Getter for scenario title
     * @return scenario title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for scenario title
     * @param title scenario title
     */
    public void setTitle(String title) { this.title = title; }

    /**
     * Getter for actors list
     * @return scenario actors ArrayList
     */
    public ArrayList<String> getActors() {
        return this.actors;
    }

    /**
     * Getter for steps list
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
     * @param step step to add to the scenario
     */
    public void addStep(Step step) {
        this.steps.add(step);
    }

    /**
     * Adds an actor to the actors ArrayList
     * @param actor actor to add to the scenario
     */
    public void addActor(String actor) {
        this.actors.add(actor);
    }

    /**
     * Getter for the system actor
     * @return system actor
     */
    public String getSystemActor() { return systemActor; }

    /**
     * Setter for systemActor
     * @param systemActor system actor to set
     */
    public void setSystemActor(String systemActor) { this.systemActor = systemActor; }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
