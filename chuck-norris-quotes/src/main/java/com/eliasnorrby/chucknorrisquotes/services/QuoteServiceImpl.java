package com.eliasnorrby.chucknorrisquotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements
  QuoteService {

  private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

  @Override
  public String getQuote() {
    return quotes.getRandomQuote();
  }
}
