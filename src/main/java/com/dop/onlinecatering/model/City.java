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
@Table(name = "cities")
public class City extends AuditModel {

    private String name;

    @OneToMany
    private List<SubCity> subCities = new ArrayList<>();
}
