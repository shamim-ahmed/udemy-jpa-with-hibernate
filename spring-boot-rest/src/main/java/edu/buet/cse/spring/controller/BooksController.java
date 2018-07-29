package edu.buet.cse.spring.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.buet.cse.spring.model.Book;

@RestController
public class BooksController {
  
  @GetMapping("/books")
  public List<Book> getAllBooks() {
    return Arrays.asList(new Book(1, "White Mughals", "William Dalrymple"),
        new Book(2, "The Argumentative Indian", "Amartya Sen"));
  }
}
