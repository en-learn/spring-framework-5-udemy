package com.eliasnorrby.springdi.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

  @Override
  public String getEnglishGreeting() {
    return "Hello World - EN";
  }

  @Override
  public String getSpanishGreeting() {
    return "Hola Mundo - ES";
  }
}
