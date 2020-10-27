package com.eliasnorrby.chucknorrisquotes.controllers;

import com.eliasnorrby.chucknorrisquotes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

  private final JokeService jokeService;

  public JokeController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @GetMapping("/")
  public String index(Model model) {
    String quote = jokeService.getQuote();

    model.addAttribute("joke", quote);
    return "index";
  }
}
