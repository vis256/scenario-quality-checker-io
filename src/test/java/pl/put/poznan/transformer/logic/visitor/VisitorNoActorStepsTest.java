package pl.put.poznan.transformer.logic.visitor;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.Scenario;

import java.io.IOException;

class VisitorNoActorStepsTest {
    private static Scenario s;
    @BeforeAll
    static void loadScenario() throws IOException {
        var tmp = IOUtils.toString(VisitorNoActorStepsTest.class.getResourceAsStream("sampleScenario.json"), "UTF-8");
        Gson g1 = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        VisitorNoActorStepsTest.s = g1.fromJson(tmp, Scenario.class);
    }

    @Test
    void testVisit() {
        VisitorNoActorSteps v1 = new VisitorNoActorSteps();
        v1.visit(this.s);
        var steps = v1.getSteps();
        assert steps.contains("otherActor steals the coffee");
        assert steps.contains("Nothing to see there");
    }
}