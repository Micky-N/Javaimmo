package com.micky.immo.model;

import com.micky.immo.key.PropertyAgentKey;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "property_agent")
public class PropertyAgent {

    @EmbeddedId
    private PropertyAgentKey id;

    @ManyToOne
    @MapsId("agentId")
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @ManyToOne
    @MapsId("propertyId")
    @JoinColumn(name = "property_id")
    private Property property;

    public void setId(PropertyAgentKey id) {
        this.id = id;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
