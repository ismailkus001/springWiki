package com.springWiki.SpringWiki.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class underPage extends mainPage {


    private String title;
    private String description;
    private String explanation;


}
