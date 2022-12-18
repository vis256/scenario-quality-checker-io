package pl.put.poznan.transformer.rest;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.QualityChecker;
import pl.put.poznan.transformer.logic.Scenario;

@RestController
@RequestMapping("/load")
public class LoadController {
    private static final Logger log = LoggerFactory.getLogger(LoadController.class);

    private final QualityChecker qualityChecker;

    @Autowired
    public LoadController( QualityChecker qc ) {
        this.qualityChecker = qc;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public void post(@RequestBody String scenarioJSONString) {
        log.info("[POST] /load");

        Gson g = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        Scenario s = g.fromJson(scenarioJSONString, Scenario.class);

        log.debug("Loading scenario into memory: " + s.getTitle());
        this.qualityChecker.setScenario( s );

        log.debug("Successfully loaded scenario!");
    }
}
