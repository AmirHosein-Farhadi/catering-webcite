package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends AuditModel {

    @NotBlank
    @NotNull
    @Column(unique = true)
    private String phoneNumber;

    private String firstName;
    private String lastName;
    private char gender = 'u';
    private String email;
    private String address;
    private String postalCode;
    private String nationalCode;

    @ManyToOne
    private City city;

    private List<Review> reviews;

}