package com.example.design.lldPatterns.mediatorPattern.example2;

import java.util.ArrayList;
import java.util.List;

// Interface representing a chat participant
interface User {
  void receiveMessage(String message, User sender);
  void sendMessage(String message);
  void setUsername(String username);
  String getUsername();
}

// Concrete class representing a user
class ConcreteUser implements User {

  private final String username;
  private ChatMediator mediator;

  public ConcreteUser(String username, ChatMediator mediator) {
    this.username = username;
    this.mediator = mediator;
  }

  @Override
  public void receiveMessage(String message, User sender) {
    System.out.println(sender.getUsername() + ": " + message);
  }

  @Override
  public void sendMessage(String message) {
    mediator.sendMessage(message, this);
  }

  @Override
  public void setUsername(String username) {
    // Not applicable in this example
  }

  @Override
  public String getUsername() {
    return username;
  }
}

// Interface defining the chat mediator
interface ChatMediator {
  void sendMessage(String message, User sender);
  void addUser(User user);
}

// Concrete class implementing the chat mediator
class ChatRoom implements ChatMediator {

  private List<User> users;

  public ChatRoom() {
    this.users = new ArrayList<>();
  }

  @Override
  public void sendMessage(String message, User sender) {
    for (User user : users) {
      if (user != sender) {
        user.receiveMessage(message, sender);
      }
    }
  }

  @Override
  public void addUser(User user) {
    this.users.add(user);
  }
}

// Usage Example
public class Main {
  public static void main(String[] args) {
    ChatMediator chatRoom = new ChatRoom();

    User user1 = new ConcreteUser("Alice", chatRoom);
    User user2 = new ConcreteUser("Bob", chatRoom);

    chatRoom.addUser(user1);
    chatRoom.addUser(user2);

    user1.sendMessage("Hello everyone!");
    user2.sendMessage("Hi Alice!");
  }
}
