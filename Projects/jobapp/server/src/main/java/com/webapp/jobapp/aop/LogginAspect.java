package com.webapp.jobapp.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogginAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogginAspect.class); 
    public void logMethodCall() {
        LOGGER.info("Method Called");
    }
}
