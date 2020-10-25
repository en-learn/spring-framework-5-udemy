package com.eliasnorrby.springdi.controllers;

import com.eliasnorrby.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContructorInjectedControllerTest {

  ContructorInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new ContructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}
