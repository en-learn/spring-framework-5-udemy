package services;

import java.util.Set;

public interface Service<T> {

  T findById(Long id);

  T save(T item);

  Set<T> findAll();
}
