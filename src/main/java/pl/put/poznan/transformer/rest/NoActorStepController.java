package pl.put.poznan.transformer.rest;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.QualityChecker;

@RestController
@RequestMapping("/noActorStepCount")
public class NoActorStepController {
    private static final Logger log = LoggerFactory.getLogger(NoActorStepController.class);

    private final QualityChecker qualityChecker;

    public NoActorStepController(QualityChecker q1) { this.qualityChecker = q1; }
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get() {
        log.info("[GET] /noActorStepCount");

        Gson g1 = new Gson();
        return g1.toJson(qualityChecker.getNoActorSteps());
    }
}
