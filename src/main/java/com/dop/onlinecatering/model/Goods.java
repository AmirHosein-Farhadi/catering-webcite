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
@Table(name = "goods")
public class Goods extends AuditModel {

    @NotNull
    private String goodName ;
    private String description;
    @NotNull
    private int goodPrice;
    @OneToMany
    private List<Pictures> pictures = new ArrayList<>();
    @OneToOne
    private GoodTypes goodType;

}
