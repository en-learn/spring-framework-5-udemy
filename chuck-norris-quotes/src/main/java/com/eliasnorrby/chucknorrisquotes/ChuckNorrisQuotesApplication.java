package com.eliasnorrby.chucknorrisquotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChuckNorrisQuotesApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChuckNorrisQuotesApplication.class, args);
  }
}
