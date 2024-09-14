package com.webapp.jobapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogginAspect.class); 
    
    // return type, fully qualified class-name.method name, arguents

    @Before("execution(* com.webapp.jobapp.service.JobService.getJobPost(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called " + jp.getSignature().getName());
    }
}
