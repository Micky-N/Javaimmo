package com.micky.immo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micky.immo.model.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
