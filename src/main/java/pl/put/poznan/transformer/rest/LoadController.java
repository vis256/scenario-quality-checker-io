package pl.put.poznan.transformer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class LoadController {
    private static final Logger log = LoggerFactory.getLogger(LoadController.class);

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public int post() {
        log.info("[POST] /load");

        // TODO: Return actual data

        return 13;
    }
}
