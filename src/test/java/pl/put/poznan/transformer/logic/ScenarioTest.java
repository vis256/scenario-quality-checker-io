package pl.put.poznan.transformer.logic;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;
import com.google.gson.Gson;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;
class ScenarioTest {
    @Test
    void testDeserialize() {
        final String title = "ILove";
        final String actor = "This";
        final String systemActor = "Language";
        Gson g1 = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        String jason = "{\"title\": \""+title+"\", \"actors\": [\""+actor+"\"], \"system_actor\": \""+systemActor+"\"}";
        Scenario s1 = g1.fromJson(jason, Scenario.class);

        assertEquals(title, s1.getTitle());
        assertEquals(actor, s1.getActors().get(0));
        assertEquals(systemActor, s1.getSystemActor());
    }

    @Test
    void testSerialize() throws IOException {
        Gson g1 = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        Scenario sc = new Scenario("IWant", "ToDie");
        String json = g1.toJson(sc);

        assertEquals("{\"title\":\"IWant\",\"system_actor\":\"ToDie\"}", json);
    }
}
