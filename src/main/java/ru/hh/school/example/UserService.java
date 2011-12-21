package ru.hh.school.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

  private final UserRepository users;

  @Autowired
  public UserService(UserRepository users) {
    this.users = users;
  }

  public User registerUser(String email, String password, String fullName) throws EmailAlreadyBoundException {
    User existing = users.byEmail(email);
    if (existing != null)
      throw new EmailAlreadyBoundException(email);
    User user = new User(email, password, fullName);
    users.put(user);
    return user;
  }
}
