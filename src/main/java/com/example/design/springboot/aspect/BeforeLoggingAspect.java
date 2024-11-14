package com.example.design.springboot.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeLoggingAspect {

    @Before("execution(* com.example.services.*.*(..))")
    public void logBeforeMethod() {
        System.out.println("A method in the service layer is about to be called.");
    }
}

////Explanation:
////
////@Before("execution(* com.example.services.*.*(..))"): This pointcut expression targets all methods in classes under the com.example.services package.
////The method logBeforeMethod will run before each targeted method executes.