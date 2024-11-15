package com.example.design.designPatterns.mediatorPattern.example1;

public class Component2 extends Component {
    public Component2(Mediator mediator) {
        super(mediator);
    }

    public void doB() {
        System.out.println("Component2 does B.");
        mediator.notify(this, "B");
    }

    public void doC() {
        System.out.println("Component2 does C.");
    }
}
