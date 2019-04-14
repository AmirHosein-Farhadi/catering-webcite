package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class OrderList extends AuditModel {

    @OneToMany
    private List<Good> goods = new ArrayList<>();

    @ManyToOne
    private User user;

    @OneToMany
    private List<Packages> packages = new ArrayList<>();

    //todo define an enum to for the condition of delivery

}
