package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "pictures")
public class Pictures extends AuditModel {

    private String name;

    //todo this class has a lot of work to do

}
