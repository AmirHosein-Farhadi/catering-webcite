package com.dop.onlinecatering.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@Entity
@Table(name = "discount")
public class Discounts extends AuditModel {

    @NotNull
    private int discountPercent;
    private String discountName;
    private String discountCode;

}
