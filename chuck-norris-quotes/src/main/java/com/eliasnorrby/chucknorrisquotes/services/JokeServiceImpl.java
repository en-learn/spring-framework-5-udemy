package com.eliasnorrby.chucknorrisquotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

  public JokeServiceImpl() {
    this.quotes = new ChuckNorrisQuotes();
  }

  private final ChuckNorrisQuotes quotes;

  @Override
  public String getQuote() {
    return quotes.getRandomQuote();
  }
}
