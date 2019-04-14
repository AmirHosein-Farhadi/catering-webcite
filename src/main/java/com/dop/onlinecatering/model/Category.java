package com.dop.onlinecatering.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "category")
public class Category extends AuditModel {

    @NotNull
    private String category;//ie fruit,dairy ,....

}
