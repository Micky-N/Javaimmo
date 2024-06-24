package com.micky.immo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.micky.immo.model.PropertyAgent;

public interface PropertyAgentRepository extends JpaRepository<PropertyAgent, Long> {
    @Query("""
            select pa
            from property_agent pa
            where
                pa.agent_id = :agentId and
                pa.property_id = :propertyId
            limit 1
            """)
    Optional<PropertyAgent> findOne(
            @Param("agentId") Long agentId,
            @Param("propertyId") Long propertyId);

    @Query("""
            delete
            from property_agent pa
            where
                pa.agent_id = :agentId and
                pa.property_id = :propertyId
            limit 1
            """)
    void deleteByKey(
            @Param("agentId") Long agentId,
            @Param("propertyId") Long propertyId);
}
