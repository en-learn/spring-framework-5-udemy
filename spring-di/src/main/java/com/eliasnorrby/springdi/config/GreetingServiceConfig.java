package com.eliasnorrby.springdi.config;

import com.eliasnorrby.springdi.services.GreetingRepository;
import com.eliasnorrby.springdi.services.GreetingService;
import com.eliasnorrby.springdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

  @Bean
  GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
    return new GreetingServiceFactory(greetingRepository);
  }

  @Bean
  @Profile("EN")
  GreetingService i18nEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreatingService("en");
  }

  @Bean
  @Profile("ES")
  GreetingService i18nSpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreatingService("es");
  }
}
