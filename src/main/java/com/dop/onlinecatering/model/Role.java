package com.dop.onlinecatering.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@AllArgsConstructor
@Entity
public class Role extends AuditModel {
    public Role() {
    }

    //todo to be checked with security
    private String name;
}
