package com.micky.immo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micky.immo.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
