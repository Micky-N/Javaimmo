package com.micky.immo.service;

import java.util.List;

import com.micky.immo.model.Agent;

public interface AgentService {

    List<Agent> getAll();

    Agent add(Agent entity);

    Agent update(Agent entity);

    void delete(Long id);

    Agent findById(Long id);
}

