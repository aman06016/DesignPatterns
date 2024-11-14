package com.example.design.springboot.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingExceptionLoggingAspect {

    @AfterThrowing(pointcut = "execution(* com.example.services.*.*(..))", throwing = "ex")
    public void logAfterThrowing(Exception ex) {
        System.out.println("An exception has been thrown: " + ex.getMessage());
    }
}

//The @AfterThrowing annotation is used to execute code only when a method throws an exception.
// This is useful for logging errors, handling exceptions, or alerting on failures.
