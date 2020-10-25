package com.eliasnorrby.springdi.controllers;

import com.eliasnorrby.springdi.services.GreetingService;

public class PropertyInjectedController {

  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }

}
