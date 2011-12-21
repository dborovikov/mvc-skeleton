package ru.hh.school.example.ddd;

public interface Repository<T extends Entity> {
  public void put(T entity);
  public T byId(Long id);
  public void remove(T entity);
  Iterable<T> all();
}
