package ru.hh.school.example;

import ru.hh.school.example.ddd.Repository;

public interface UserRepository extends Repository<User> {
  User byEmail(String email);
}
