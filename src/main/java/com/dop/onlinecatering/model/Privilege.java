package com.dop.onlinecatering.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"roles"}, callSuper = false)
@Entity
public class Privilege extends AuditModel {

    private String name;

    public Privilege(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles;

}