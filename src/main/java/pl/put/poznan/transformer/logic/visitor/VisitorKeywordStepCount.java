package pl.put.poznan.transformer.logic.visitor;

import pl.put.poznan.transformer.logic.Scenario;
import pl.put.poznan.transformer.logic.Step;

public class VisitorKeywordStepCount implements Visitor {
    private int keywords = 0;

    @Override
    public void visit(Scenario scenario) {
        for (Step substep : scenario.getSteps()) {
            substep.accept( this );
        }
    }

    @Override
    public void visit(Step step) {
        String text = step.getText();
        if(text.startsWith("FOR EACH") || text.startsWith("IF") || text.startsWith("ELSE")) {
            this.keywords++;
        }
        for (Step substep : step.getSteps()) {
            substep.accept( this );
        }
    }

    public int getKeywordsNumber() {
        return keywords;
    }
}
