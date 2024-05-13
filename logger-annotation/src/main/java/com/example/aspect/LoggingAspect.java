package com.example.aspect;

import com.example.annotation.LogMethod;
import com.example.domain.DomainObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("@annotation(com.example.annotation.LogMethod)")
    public void logBeforeMethodExecution(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        LogMethod logMethodAnnotation = AnnotationUtils.findAnnotation(joinPoint.getSignature().getDeclaringType(), LogMethod.class);
        if (logMethodAnnotation != null) {
            String value = logMethodAnnotation.value();
            System.out.println("Value from annotation: " + value);
        }

        System.out.println("Total args: " + args.length);
    }

    @AfterReturning(value = "@annotation(com.example.annotation.LogMethod)", returning = "result")
    public void logAfterMethodExecution(JoinPoint joinPoint, DomainObject result) {
        System.out.println("returning: " + result);
    }
}