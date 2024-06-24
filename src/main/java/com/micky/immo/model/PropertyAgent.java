package com.micky.immo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "property_agent")
public class PropertyAgent {

    @Id
    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @Id
    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

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
