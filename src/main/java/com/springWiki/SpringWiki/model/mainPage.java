package com.springWiki.SpringWiki.model;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DiscriminatorOptions;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity(name = "mainPage")
@Table(name = "mainPage")
@Getter
@Setter
@DiscriminatorValue("mainPage")
@DiscriminatorOptions(force = true)
@EqualsAndHashCode(callSuper = false)
public class mainPage {

    @Id
    @GeneratedValue
    private Long ID;
    @OneToMany(targetEntity = underPage.class, mappedBy = "mainPage", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<underPage> underPages;

    @NotNull
    private String title;
    @NotNull
    private String explanation;

}
