package com.example.design.springboot.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME) // The annotation will be available at runtime
@Target(ElementType.METHOD) // The annotation can only be applied to methods
public @interface LogExecutionTime {
}


