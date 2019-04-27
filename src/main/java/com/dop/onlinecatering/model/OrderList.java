package com.dop.onlinecatering.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode(exclude = {"packages", "goods"}, callSuper = true)
@Entity
@Table(name = "order_lists")
public class OrderList extends AuditModel {

    @OneToMany
    private List<Good> goods = new ArrayList<>();

    @OneToMany
    private List<Package> packages = new ArrayList<>();


}
