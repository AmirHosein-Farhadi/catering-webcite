package com.dop.onlinecatering.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "good_types")
public class GoodTypes extends AuditModel {

    @NotNull
    private String goodTypeName;//ie fruit,dairy ,....

}
