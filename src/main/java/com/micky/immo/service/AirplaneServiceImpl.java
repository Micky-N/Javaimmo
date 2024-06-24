package com.micky.immo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micky.immo.model.Airplane;
import com.micky.immo.repository.AirplaneRepository;

@Service
public class AirplaneServiceImpl implements AirplaneService {

    @Autowired
    AirplaneRepository airplaneRepository;

    @Override
    public List<Airplane> getAll() {
        return airplaneRepository.findAll();
    }

    @Override
    public void add(Airplane airplane) {
        airplaneRepository.save(airplane);
    }

    @Override
    public void update(Airplane airplane) {
        if (findById(airplane.getId()) != null) {
            airplaneRepository.save(airplane);
        }
    }

    @Override
    public void delete(Long id) {
        airplaneRepository.deleteById(id);
    }

    @Override
    public Airplane findById(Long id) {
        Optional<Airplane> optionalAirplane = airplaneRepository.findById(id);
        if (optionalAirplane.isPresent()) {
            return optionalAirplane.get();
        }
        return null;
    }

    @Override
    public Long count() {
        return airplaneRepository.count();
    }

}
