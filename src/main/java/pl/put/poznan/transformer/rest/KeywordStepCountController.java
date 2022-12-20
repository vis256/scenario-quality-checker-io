package pl.put.poznan.transformer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.QualityChecker;

@RestController
@RequestMapping("/keywordStepCount")
public class KeywordStepCountController {
    private static final Logger log = LoggerFactory.getLogger(KeywordStepCountController.class);

    private final QualityChecker qualityChecker;

    public KeywordStepCountController(QualityChecker qc) { this.qualityChecker = qc; }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public int get() {
        log.info("[GET] /keywordStepCount");
        return this.qualityChecker.getKeywordsCount();
    }
}
