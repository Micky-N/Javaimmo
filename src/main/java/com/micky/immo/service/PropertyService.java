package com.micky.immo.service;

import java.util.List;

import com.micky.immo.model.Property;

public interface PropertyService {

    List<Property> getAll();

    Property add(Property entity);

    Property update(Property entity);

    void delete(Long id);

    Property findById(Long id);
}

