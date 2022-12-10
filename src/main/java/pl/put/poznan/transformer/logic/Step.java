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
}
