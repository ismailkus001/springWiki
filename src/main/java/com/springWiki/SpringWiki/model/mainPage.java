package com.springWiki.SpringWiki.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="mainPage")
public class mainPage {

    @Id
    private Integer id;
    @NotNull
    private String title;
    @NotNull
    private String explanation;

}
