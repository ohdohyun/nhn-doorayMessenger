package com.nhnacademy.edu.springframework.dooraySender;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(TimeLog)")
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
            System.out.println(stopWatch.prettyPrint());
        }

        return retVal;
    }
}
