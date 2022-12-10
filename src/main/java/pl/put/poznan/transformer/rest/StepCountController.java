package pl.put.poznan.transformer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stepCount")
public class StepCountController {
    private static final Logger log = LoggerFactory.getLogger(StepCountController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public int get() {
        log.info("[GET] /stepCount");

        // TODO: Return actual data

        return 13;
    }
}
