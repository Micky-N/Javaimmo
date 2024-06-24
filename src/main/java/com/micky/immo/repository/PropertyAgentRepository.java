package com.micky.immo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micky.immo.key.PropertyAgentKey;
import com.micky.immo.model.PropertyAgent;

public interface PropertyAgentRepository extends JpaRepository<PropertyAgent, PropertyAgentKey> {
    List<PropertyAgent> findByIdAgentId(Long agentId);
}
