package com.eliasnorrby.springdi.controllers;

import com.eliasnorrby.springdi.services.GreetingService;

public class ContructorInjectedController {

  private final GreetingService greetingService;

  public ContructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
