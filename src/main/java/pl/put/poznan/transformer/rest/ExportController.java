package pl.put.poznan.transformer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/export")
public class ExportController {
    private static final Logger log = LoggerFactory.getLogger(ExportController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public int get() {
        log.info("[GET] /export");

        // TODO: Return actual data

        return 13;
    }
}
