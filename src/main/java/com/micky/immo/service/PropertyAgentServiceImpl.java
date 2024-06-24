package com.micky.immo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micky.immo.key.PropertyAgentKey;
import com.micky.immo.model.PropertyAgent;
import com.micky.immo.repository.PropertyAgentRepository;

import java.util.List;

@Service
public class PropertyAgentServiceImpl implements PropertyAgentService {

    @Autowired
    PropertyAgentRepository propertyAgentRepository;

    @Override
    public List<PropertyAgent> getAll() {
        return propertyAgentRepository.findAll();
    }

    @Override
    public PropertyAgent add(PropertyAgent propertyAgent) {
        return propertyAgentRepository.save(propertyAgent);
    }

    @Override
    public PropertyAgent update(PropertyAgent propertyAgent) {
        return propertyAgentRepository.save(propertyAgent);
    }

    @Override
    public void delete(PropertyAgentKey id) {
        propertyAgentRepository.deleteById(id);
    }

    @Override
    public PropertyAgent findById(PropertyAgentKey id) {
        return propertyAgentRepository.findById(id).orElse(null);
    }

    @Override
    public List<PropertyAgent> findByAgentId(Long agentId) {
        return propertyAgentRepository.findByIdAgentId(agentId);
    }
}

