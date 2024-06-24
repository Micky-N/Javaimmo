package com.micky.immo.service;

import java.util.List;

import com.micky.immo.model.Owner;

public interface OwnerService {
    List<Owner> getAll();

    Owner add(Owner entity);

    Owner update(Owner entity);

    void delete(Long id);

    Owner findById(Long id);
}

