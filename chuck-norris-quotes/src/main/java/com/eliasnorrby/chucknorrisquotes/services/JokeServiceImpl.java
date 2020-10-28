package com.eliasnorrby.chucknorrisquotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

  private final ChuckNorrisQuotes quotes;

  public JokeServiceImpl(ChuckNorrisQuotes quotes) {
    this.quotes = quotes;
  }

  @Override
  public String getQuote() {
    return quotes.getRandomQuote();
  }
}
