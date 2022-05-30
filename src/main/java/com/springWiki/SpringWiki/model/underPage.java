package com.springWiki.SpringWiki.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@EqualsAndHashCode(callSuper = false, exclude = "mainPage")
@Entity(name = "underPage")
@Table(name = "underPage")
@Getter
@Setter
public class underPage {

    @Id
    @GeneratedValue
    private Long ID;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mainTitleId")
    @JsonIgnore
    private mainPage mainPage;
    private String description;
    private String explanation;


}
