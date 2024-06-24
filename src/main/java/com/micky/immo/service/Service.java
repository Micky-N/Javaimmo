package com.micky.immo.service;

import java.util.List;

public interface Service<T> {
    List<T> getAll();

    T add(T entity);

    T update(T entity);

    void delete(Long id);

    T findById(Long id);
}
