package com.example.design.designPatterns.commandPattern;

// Interface for a command (encapsulates request)
interface LightCommand {
  void execute();
}

// Concrete command - Turn On Light
class TurnOnLightCommand implements LightCommand {
  private final Light light;

  public TurnOnLightCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOn();
  }
}

// Concrete command - Turn Off Light
class TurnOffLightCommand implements LightCommand {
  private final Light light;

  public TurnOffLightCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOff();
  }
}

// Receiver class - Light (performs action)
class Light {
  private boolean isOn;

  public void turnOn() {
    isOn = true;
    System.out.println("Light turned on");
  }

  public void turnOff() {
    isOn = false;
    System.out.println("Light turned off");
  }
}

// Invoker class - Switch (requests execution)
class LightSwitch {
  private LightCommand command;

  public void setCommand(LightCommand command) {
    this.command = command;
  }

  public void press() {
    if (command != null) {
      command.execute();
    }
  }
}

// Usage Example
public class Main {
  public static void main(String[] args) {
    Light light = new Light();
    LightSwitch switch1 = new LightSwitch();

    // Associate commands with switch
    switch1.setCommand(new TurnOnLightCommand(light));
    switch1.press(); // Light turned on

    switch1.setCommand(new TurnOffLightCommand(light));
    switch1.press(); // Light turned off
  }
}
