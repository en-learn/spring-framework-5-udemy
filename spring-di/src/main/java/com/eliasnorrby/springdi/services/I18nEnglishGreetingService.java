package com.eliasnorrby.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nEnglishGreetingService implements GreetingService {

  private final GreetingRepository greetingRepository;

  public I18nEnglishGreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public String sayGreeting() {
    return greetingRepository.getEnglishGreeting();
  }
}
