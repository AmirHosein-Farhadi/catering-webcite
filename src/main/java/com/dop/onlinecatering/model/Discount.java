package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "discounts")
public class Discount extends AuditModel {

    //todo use id as the discount code if needed

    @NotNull
    private int discountPercent;

    private String discountName;
}
