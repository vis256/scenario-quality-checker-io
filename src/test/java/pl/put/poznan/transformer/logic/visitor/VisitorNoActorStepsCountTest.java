package pl.put.poznan.transformer.logic.visitor;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.Scenario;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class VisitorNoActorStepsCountTest {
    private static Scenario s;
    @BeforeAll
    static void loadScenario() throws IOException {
        var tmp = IOUtils.toString(VisitorNoActorStepsCountTest.class.getResourceAsStream("sampleScenario.json"), "UTF-8");
        Gson g1 = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        VisitorNoActorStepsCountTest.s = g1.fromJson(tmp, Scenario.class);
    }

    @Test
    void testVisit() {
        VisitorNoActorStepsCount v1 = new VisitorNoActorStepsCount();
        v1.visit(this.s);
        assertEquals(2, v1.getSteps());
    }
}