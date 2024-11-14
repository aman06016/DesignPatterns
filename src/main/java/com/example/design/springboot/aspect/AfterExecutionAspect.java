package com.example.design.springboot.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterExecutionAspect {

    @After("execution(* com.example.services.*.*(..))") // pointCut expression means ->
    // all class under services folder ,all methods inside each classes.
    public void logAfterMethod() {
        System.out.println("A method in the service layer has finished execution.");
    }
}


//The @After annotation is used to execute code after a specified method completes, regardless of the outcome (success or exception). This can be useful for cleanup operations or final logging.

