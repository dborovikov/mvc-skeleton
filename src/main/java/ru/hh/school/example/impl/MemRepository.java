package ru.hh.school.example.impl;

import java.util.HashMap;
import java.util.Map;
import ru.hh.school.example.ddd.Entity;
import ru.hh.school.example.ddd.Repository;

public abstract class MemRepository<T extends Entity> implements Repository<T> {

  private final Map<Long, T> identityMap = new HashMap<Long, T>();
  private Long counter = 0L;

  public void put(T entity) {
    entity.setId(++counter);
    identityMap.put(entity.getId(), entity);
  }

  public T byId(Long id) {
    return identityMap.get(id);
  }

  public void remove(T entity) {
    identityMap.remove(entity.getId());
  }

  public Iterable<T> all() {
    return identityMap.values();
  }
}
