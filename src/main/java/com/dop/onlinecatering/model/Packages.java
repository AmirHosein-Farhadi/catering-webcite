package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "packages")
public class Packages extends AuditModel {

    @NotNull
    private String title;

    @NotNull
    private int price;

    @OneToOne
    private Discount discount;

    @Lob
    private String description;

    @OneToMany
    private List<Pictures> pictures = new ArrayList<>();

    @OneToMany
    private List<Good> goods = new ArrayList<>();

    @OneToMany
    private List<Review> reviews = new ArrayList<>();

}
