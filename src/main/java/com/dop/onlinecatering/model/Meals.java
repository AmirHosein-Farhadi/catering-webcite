package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "meals")
public class Meals extends AuditModel {

    private String mealName;
    private String mealDescription;

    @OneToMany
    private List<Pictures> mealPictures = new ArrayList<>();

}
