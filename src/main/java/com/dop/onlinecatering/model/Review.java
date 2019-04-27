package com.dop.onlinecatering.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Table(name = "review")
@Entity
public class Review extends AuditModel {

    @ManyToOne
    private User user;

    private int rating;

    @Lob
    private String comment;
}
