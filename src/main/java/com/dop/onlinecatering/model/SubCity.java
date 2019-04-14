package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "sub_city")
@Entity
public class SubCity extends AuditModel { // NOT NECESSARY !!!!

    private String name;

    @ManyToOne
    private City parentCity;
}
