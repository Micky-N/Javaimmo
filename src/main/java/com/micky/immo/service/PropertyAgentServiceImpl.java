package com.micky.immo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void delete(Long agentId, Long propertyId) {
        propertyAgentRepository.deleteByKey(agentId, propertyId);
    }

    @Override
    public PropertyAgent findById(Long agentId, Long propertyId) {
        return propertyAgentRepository.findOne(agentId, propertyId).orElse(null);
    }
}

