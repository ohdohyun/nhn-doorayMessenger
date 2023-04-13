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
            String className = pjp.getClass().getSimpleName();
            String methodName = pjp.getSignature().getName();
            long elapsedTime = stopWatch.getTotalTimeMillis();
            System.out.println("[" + className + "].[" + methodName + "] [" + elapsedTime + "]ms");
        }

        return retVal;
    }
}
