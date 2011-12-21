package ru.hh.school.example.web;

import ru.hh.school.example.User;

public class UserInfo {
  
  private final Long id;
  private final String email;
  private final String fullName;

  public UserInfo(User user) {
    this.id = user.getId();
    this.email = user.getEmail();
    this.fullName = user.getFullName();
  }

  public Long getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public String getFullName() {
    return fullName;
  }
}
