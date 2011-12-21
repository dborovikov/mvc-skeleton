package ru.hh.school.example.impl;

import org.springframework.stereotype.Component;
import ru.hh.school.example.User;
import ru.hh.school.example.UserRepository;

@Component
public class MemUserRepository extends MemRepository<User> implements UserRepository {
  public User byEmail(String email) {
    for (User user : all())
      if (user.getEmail().equals(email))
        return user;
    return null;
  }
}
