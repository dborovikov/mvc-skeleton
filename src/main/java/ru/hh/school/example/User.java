package ru.hh.school.example;

import ru.hh.school.example.ddd.Entity;

public class User extends Entity {

  private String email;
  private String password;
  private String fullName;

  public User(String email, String password, String fullName) {
    this.email = email;
    this.password = password;
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getFullName() {
    return fullName;
  }
}
