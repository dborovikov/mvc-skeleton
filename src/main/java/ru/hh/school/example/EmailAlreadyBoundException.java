package ru.hh.school.example;

public class EmailAlreadyBoundException extends Exception {

  private final String email;

  public EmailAlreadyBoundException(String email) {
    super(email);
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
}
