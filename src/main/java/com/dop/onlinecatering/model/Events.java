package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "events")
public class Events extends AuditModel {

    @NotNull
    private String title;
    @OneToMany
    private List<Pictures> picture = new ArrayList<>();
    private String content;

}
