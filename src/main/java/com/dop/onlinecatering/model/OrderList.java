package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class OrderList extends AuditModel {

    @OneToMany
    private List<Goods> goodLists =new ArrayList<>();

    @OneToOne
    private Address address;

    @OneToOne
    private User user;

    @OneToMany
    private List<Packages> packagesList = new ArrayList<>();

    //flag??????

}
