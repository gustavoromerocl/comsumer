package com.duocuc.consumer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "messages")
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String message;

  // Constructor vacío (exigido por JPA)
  public Message() {
  }

  public Message(String message) {
    this.message = message;
  }

  // Getters y setters
  public Long getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
