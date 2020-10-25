package com.eliasnorrby.springdi.services;

public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World";
  }
}
