package com.example.design.designPatterns.mediatorPattern.example1;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Component1 component1 = new Component1(mediator);
        Component2 component2 = new Component2(mediator);

        mediator.setComponent1(component1);
        mediator.setComponent2(component2);

        component1.doA(); // Triggers component2.doC()
        component2.doB(); // Triggers component1.doB()
    }
}
