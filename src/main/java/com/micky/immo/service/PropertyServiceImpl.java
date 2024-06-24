package com.micky.immo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micky.immo.model.Property;
import com.micky.immo.repository.PropertyRepository;

import java.util.List;

@Service
public class PropertyServiceImpl  implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public List<Property> getAll() {
        return propertyRepository.findAll();
    }

    @Override
    public Property add(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public Property update(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public void delete(Long id) {
        propertyRepository.deleteById(id);
    }

    @Override
    public Property findById(Long id) {
        return propertyRepository.findById(id).orElse(null);
    }
}

