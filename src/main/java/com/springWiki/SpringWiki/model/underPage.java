package com.springWiki.SpringWiki.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "underPage")
public class underPage extends mainPage {


    private String title;
    private String description;
    private String explanation;


}
