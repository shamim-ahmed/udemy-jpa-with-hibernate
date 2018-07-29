package edu.buet.cse.spring.model;

public class Book {
  private final long id;
  private final String title;
  private final String author;

  public Book(long id, String title, String author) {
    this.id = id;
    this.title = title;
    this.author = author;
  }
  
  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    return String.format("Book[ id=%d, title=%s, author=%s]", id, title, author);
  }
}
