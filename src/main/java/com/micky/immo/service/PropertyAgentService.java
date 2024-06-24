package com.micky.immo.service;

import java.util.List;

import com.micky.immo.model.PropertyAgent;

public interface PropertyAgentService {
    List<PropertyAgent> getAll();

    PropertyAgent add(PropertyAgent entity);

    PropertyAgent update(PropertyAgent entity);

    void delete(Long agentId, Long propertyId);

    PropertyAgent findById(Long agentId, Long propertyId);
}
