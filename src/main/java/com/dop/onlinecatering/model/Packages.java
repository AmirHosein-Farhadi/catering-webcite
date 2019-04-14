package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "packages")
public class Packages extends AuditModel {

    @NotNull
    private String packageName;
    private String packageDescription;

    @OneToMany
    private List<Pictures> picture = new ArrayList<>();

    @NotNull
    private int packagePrice;

    @OneToMany
    private List<Goods> packageGoods = new ArrayList<>();

    @OneToOne
    private Discounts discounts;

    @OneToMany
    private List<Review> review = new ArrayList<>();

}
