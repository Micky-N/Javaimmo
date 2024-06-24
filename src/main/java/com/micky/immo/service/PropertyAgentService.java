package com.micky.immo.service;

import java.util.List;

import com.micky.immo.key.PropertyAgentKey;
import com.micky.immo.model.PropertyAgent;

public interface PropertyAgentService {
    List<PropertyAgent> getAll();

    PropertyAgent add(PropertyAgent entity);

    PropertyAgent update(PropertyAgent entity);

    void delete(PropertyAgentKey id);

    PropertyAgent findById(PropertyAgentKey id);

    List<PropertyAgent> findByAgentId(Long agentId);
}
