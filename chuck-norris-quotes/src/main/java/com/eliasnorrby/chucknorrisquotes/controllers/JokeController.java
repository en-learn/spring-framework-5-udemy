package com.eliasnorrby.chucknorrisquotes.controllers;

import com.eliasnorrby.chucknorrisquotes.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

  private final QuoteService quoteService;

  public JokeController(QuoteService quoteService) {
    this.quoteService = quoteService;
  }

  @GetMapping("/")
  public String index(Model model) {
    String quote = quoteService.getQuote();

    model.addAttribute("joke", quote);
    return "index";
  }
}
