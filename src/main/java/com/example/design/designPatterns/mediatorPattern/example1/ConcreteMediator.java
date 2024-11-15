package com.example.design.designPatterns.mediatorPattern.example1;

public class ConcreteMediator implements Mediator {
    private Component1 component1;
    private Component2 component2;

    public void setComponent1(Component1 component1) {
        this.component1 = component1;
    }

    public void setComponent2(Component2 component2) {
        this.component2 = component2;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == component1) {
            if ("A".equals(event)) {
                component2.doC();
            }
        } else if (sender == component2) {
            if ("B".equals(event)) {
                component1.doB();
            }
        }
    }
}
