package com.example.design.springboot.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAspect {

    @AfterReturning(pointcut = "execution(* com.example.services.*.*(..))", returning = "result")
    public void logAfterReturning(Object result) {
        System.out.println("Method returned value: " + result);
    }
}

//The @AfterReturning annotation is used to execute code only after a method successfully completes
// (i.e., no exceptions are thrown). It can be used to log method output or post-process return values.
