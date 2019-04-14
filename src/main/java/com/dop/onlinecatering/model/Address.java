package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Getter
@Setter
@Entity
@Table(name = "address")
public class Address extends AuditModel { //why do we need to extend AuditModel ??

    @OneToOne
    private City city;
    private long addressID;
    private String fullAddress;

    @Column(unique = true)
    @Size(min=10 , max = 10)
    private String postalCode;//need some changes

}
