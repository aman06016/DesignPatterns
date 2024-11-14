package com.example.design.springboot.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDefinitions {

    // Define a pointcut for all methods in service layer
    @Pointcut("execution(* com.example.services.*.*(..))")
    public void serviceLayerExecution() {
        // Method is empty because this is just a pointcut
    }
}
