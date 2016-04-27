package com.nalaan.leonword.application;

import com.nalaan.LeonWordApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
public class LeonWordApplicationTests {
	private static final Logger logger = LogManager.getLogger(LeonWordApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.debug("This is log {} ", "nam log debug");
		logger.info("This is log {} ", "nam log info");
		logger.error("This is log {} ", "nam log error");
		logger.fatal("This is log {} ", "nam log fatal");
		logger.warn("This is log {} ", "nam log warning");
		logger.trace("This is log {} ", "nam log trace");
	}

}
