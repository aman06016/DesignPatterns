package com.example.design.designPatterns.mediatorPattern.example1;

public class Component1 extends Component {
    public Component1(Mediator mediator) {
        super(mediator);
    }

    public void doA() {
        System.out.println("Component1 does A.");
        mediator.notify(this, "A");
    }

    public void doB() {
        System.out.println("Component1 does B.");
    }
}
