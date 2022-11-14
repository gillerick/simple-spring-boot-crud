package com.example.demo1.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "page")
public class Page implements Serializable {
  @Id
  private Long id;
  private int number;
  private String content;
  private String chapter;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "book_id", nullable = false)
  private Book book;

  public Page() {
  }

  public Page(int number, String content, String chapter, Book book) {
    this.number = number;
    this.content = content;
    this.chapter = chapter;
    this.book = book;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getChapter() {
    return chapter;
  }

  public void setChapter(String chapter) {
    this.chapter = chapter;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }
}
