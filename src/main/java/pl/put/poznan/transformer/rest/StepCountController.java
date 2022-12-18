package pl.put.poznan.transformer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.QualityChecker;

@RestController
@RequestMapping("/stepCount")
public class StepCountController {
    private static final Logger log = LoggerFactory.getLogger(StepCountController.class);
    private final QualityChecker qualityChecker;

    @Autowired
    public StepCountController( QualityChecker qc ) {
        this.qualityChecker = qc;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public int get() {
        log.info("[GET] /stepCount");
        return this.qualityChecker.getStepCount();
    }
}
