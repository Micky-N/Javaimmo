package com.micky.immo.service;

import java.util.List;

import com.micky.immo.model.PropertyType;

public interface PropertyTypeService {

    List<PropertyType> getAll();

    PropertyType add(PropertyType entity);

    PropertyType update(PropertyType entity);

    void delete(Long id);

    PropertyType findById(Long id);
}
