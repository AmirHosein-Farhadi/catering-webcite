package com.dop.onlinecatering.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(exclude = "pictures", callSuper = false)
@Entity
@Table(name = "goods")
public class Good extends AuditModel {

    @NotNull
    private String title;

    @Lob
    private String description;

    @NotNull
    private int price;

    @OneToMany
    private List<Picture> pictures = new ArrayList<>();

    @OneToOne
    private Category category;

}
