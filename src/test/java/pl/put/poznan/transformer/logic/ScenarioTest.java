package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

import static org.junit.jupiter.api.Assertions.*;
class ScenarioTest {
    @Test
    void testDeserialize() {
        String jason = "{\"title\": \"sometitle\", \"actors\": [\"Someone\"], \"system_actor\": \"System\"}";
        Scenario s1 = null;
        try {
            ByteArrayInputStream bs = new ByteArrayInputStream(jason.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bs);
            s1 = (Scenario)ois.readObject();
        } catch(Exception e) {
            e.printStackTrace();
        }
        assert s1.getTitle() == "sometitle";
    }
}