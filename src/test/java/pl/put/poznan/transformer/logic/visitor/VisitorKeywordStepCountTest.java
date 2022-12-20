package pl.put.poznan.transformer.logic.visitor;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.Scenario;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorKeywordStepCountTest {
    private static Scenario s;

    @BeforeAll
    static void loadScenario() throws IOException {
        var tmp = IOUtils.toString(VisitorKeywordStepCountTest.class.getResourceAsStream("sampleScenario.json"), "UTF-8");
        Gson g1 = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        VisitorKeywordStepCountTest.s = g1.fromJson(tmp, Scenario.class);
    }

    @Test
    void testVisit() {
        VisitorKeywordStepCount v = new VisitorKeywordStepCount();
        v.visit(this.s);
        int keywords = v.getKeywordsNumber();
        assertEquals(keywords, 2);
    }

}
