package com.example.design.lldPatterns.adapterPattern.pattern2;

// Interface for a plug (incompatible)
interface Plug {
  void connect();
}

// US Plug implementation
class USPlug implements Plug {
  @Override
  public void connect() {
    System.out.println("Connecting US plug...");
  }
}

// European Plug implementation
class EuropeanPlug implements Plug {
  @Override
  public void connect() {
    System.out.println("Connecting European plug...");
  }
}

// Universal Socket Interface (compatible)
interface Socket {
  void useElectricity();
}

// Adapter class (translates plug to socket)
class PlugAdapter implements Socket {
  private final Plug plug;

  public PlugAdapter(Plug plug) {
    this.plug = plug;
  }

  @Override
  public void useElectricity() {
    System.out.println("Using adapter...");
    plug.connect(); // Calls the specific plug's connect method
  }
}

// Usage Example
public class Main {
  public static void main(String[] args) {
    Socket universalSocket = new PlugAdapter(new USPlug()); // Connect US plug
    universalSocket.useElectricity();

    universalSocket = new PlugAdapter(new EuropeanPlug()); // Connect European plug
    universalSocket.useElectricity();
  }
}
