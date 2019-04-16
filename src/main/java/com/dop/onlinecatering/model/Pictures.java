package com.dop.onlinecatering.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pictures")
public class Pictures extends AuditModel {

    private String name;

    //todo this class has a lot of work to do
    //todo if any list added exclude that from equals and hashcode
}
