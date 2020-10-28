package com.eliasnorrby.springdi.services;

public class GreetingServiceFactory {

  private GreetingRepository greetingRepository;

  public GreetingServiceFactory(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  public GreetingService createGreatingService(String lang) {
    switch (lang) {
      case "en":
        return new I18nEnglishGreetingService(greetingRepository);
      case "es":
        return new I18nSpanishGreetingService(greetingRepository);
      default:
        return new PrimaryGreetingService();
    }
  }
}
