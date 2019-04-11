package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@Entity
public class Role extends AuditModel {

    private String name;
}
