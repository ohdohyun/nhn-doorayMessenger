package com.nhnacademy.edu.springframework.dooraySender;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;


public class LoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    private Object loggingSendMessageTime(ProceedingJoinPoint pjp) {

        StopWatch stopWatch = new StopWatch();
        Object retVal;
        try {
            stopWatch.start();
            retVal = pjp.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            stopWatch.stop();
            String className = pjp.getTarget().getClass().getSimpleName();
            String methodName = pjp.getSignature().getName();
            String elapsedTime = stopWatch.getTotalTimeMillis()+"ms";
            log.info(elapsedTime);
        }

        return retVal;
    }
}
