package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Getter
@Setter
@Entity
@Table(name = "address")
public class Address extends AuditModel {

    private City city;

    @OneToOne
    private SubCity subCity;

    private long addressID;

    private String fullAddress;

    @Size(min=10 , max = 10)
    private String postalCode;      //todo Some Changes needed for postalCode

}
