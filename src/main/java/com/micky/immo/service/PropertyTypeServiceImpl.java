package com.micky.immo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micky.immo.model.PropertyType;
import com.micky.immo.repository.PropertyTypeRepository;

import java.util.List;

@Service
public class PropertyTypeServiceImpl implements PropertyTypeService {

    @Autowired
    PropertyTypeRepository propertyTypeRepository;

    @Override
    public List<PropertyType> getAll() {
        return propertyTypeRepository.findAll();
    }

    @Override
    public PropertyType add(PropertyType propertyType) {
        return propertyTypeRepository.save(propertyType);
    }

    @Override
    public PropertyType update(PropertyType propertyType) {
        return propertyTypeRepository.save(propertyType);
    }

    @Override
    public void delete(Long id) {
        propertyTypeRepository.deleteById(id);
    }

    @Override
    public PropertyType findById(Long id) {
        return propertyTypeRepository.findById(id).orElse(null);
    }
}

