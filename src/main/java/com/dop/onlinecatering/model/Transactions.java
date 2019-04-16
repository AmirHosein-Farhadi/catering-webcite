package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Transactions extends AuditModel {

    @ManyToOne
    private User user;

    @NotNull
    private String transactionCode;

    @OneToOne
    private OrderList orderList;


    //todo define an enum to for the condition of delivery
}
