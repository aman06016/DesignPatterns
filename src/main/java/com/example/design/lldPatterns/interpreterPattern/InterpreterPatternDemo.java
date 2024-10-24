package com.example.design.lldPatterns.interpreterPattern;

import java.util.HashMap;
import java.util.Map;

// 1. Abstract Expression Interface
interface Expression {
    int interpret(Context context);
}

// 2. Terminal Expression Class
class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(name);
    }
}

// 3. Non-Terminal Expression Classes
class Add implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Add(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}

class Subtract implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Subtract(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) - rightExpression.interpret(context);
    }
}

// 4. Context Class with Variable Support
class Context {
    private Map<String, Integer> variableValues = new HashMap<>();

    public void setValue(String variable, int value) {
        variableValues.put(variable, value);
    }

    public int getValue(String variable) {
        return variableValues.getOrDefault(variable, 0);
    }
}

// 5. Client Code
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setValue("x", 10);
        context.setValue("y", 5);
        context.setValue("z", 2);

        // Create expressions using variables from the context
        Expression x = new Variable("x");
        Expression y = new Variable("y");
        Expression z = new Variable("z");

        // Create add and subtract operations
        Expression addition = new Add(x, y); // x + y
        Expression subtraction = new Subtract(addition, z); // (x + y) - z

        // Interpret the final expression using the context
        System.out.println("Result: " + subtraction.interpret(context)); // Output: 13
    }
}
