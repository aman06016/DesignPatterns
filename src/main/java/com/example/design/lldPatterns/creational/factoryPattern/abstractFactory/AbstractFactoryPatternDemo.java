package com.example.design.lldPatterns.creational.factoryPattern.abstractFactory;

//The Abstract Factory Pattern is used to create families of related or dependent objects. It provides an interface to create objects of multiple families without specifying their concrete classes. The Abstract Factory Pattern is suitable when:
//
//You need to create objects from multiple families or "product" groups.
//You want to ensure that related objects are used together, enforcing a level of consistency.
//You need an additional layer of abstraction over individual factories.


// Abstract Products
interface Button {
    void paint();
}

interface Checkbox {
    void check();
}

// Concrete Products for Windows
class WindowsButton implements Button {
    public void paint() {
        System.out.println("Painting a Windows Button");
    }
}

class WindowsCheckbox implements Checkbox {
    public void check() {
        System.out.println("Checking a Windows Checkbox");
    }
}

// Concrete Products for Mac
class MacButton implements Button {
    public void paint() {
        System.out.println("Painting a Mac Button");
    }
}

class MacCheckbox implements Checkbox {
    public void check() {
        System.out.println("Checking a Mac Checkbox");
    }
}

// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete Factories for Windows and Mac
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// Using the Abstract Factory Pattern
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        GUIFactory factory;

        // Choose factory based on some configuration or environment
        String os = "Windows"; // Example OS type
        if (os.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        // Use the factory to create components
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.check();
    }
}
