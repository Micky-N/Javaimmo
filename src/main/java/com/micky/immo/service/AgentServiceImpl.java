package com.micky.immo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micky.immo.model.Agent;
import com.micky.immo.repository.AgentRepository;

import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    AgentRepository agentRepository;

    @Override
    public List<Agent> getAll() {
        return agentRepository.findAll();
    }

    @Override
    public Agent add(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public Agent update(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public void delete(Long id) {
        agentRepository.deleteById(id);
    }

    @Override
    public Agent findById(Long id) {
        return agentRepository.findById(id).orElse(null);
    }
}

