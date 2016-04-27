package com.nalaan;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    private static final Logger logger = LogManager.getLogger(HelloController.class);
    @RequestMapping("/")
    public String index() {
        logger.debug("This is log {} ", "nam log debug");
        logger.info("This is log {} ", "nam log info");
        logger.error("This is log {} ", "nam log error");
        logger.fatal("This is log {} ", "nam log fatal");
        logger.warn("This is log {} ", "nam log warning");
        logger.trace("This is log {} ", "nam log trace");
        return "Greetings from Spring Boot!";
    }

}
