package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "review")
@Entity
public class Review extends AuditModel {

    private int rating;

    private String comment;
}
