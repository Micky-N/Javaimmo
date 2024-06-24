package com.micky.immo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micky.immo.model.PropertyType;

public interface PropertyTypeRepository extends JpaRepository<PropertyType, Long> {
}
