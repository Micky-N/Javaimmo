package com.micky.immo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Data;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@Table(name = "property")
public class Property {

    @Id
    @Column(name = "property_id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int propertyId;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PropertyType propertyType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "sale_date")
    private Date saleDate;

    @Column(name = "sale_price", precision = 10, scale = 2)
    private BigDecimal salePrice;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }
}
