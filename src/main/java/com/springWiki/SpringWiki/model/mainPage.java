package com.springWiki.SpringWiki.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class mainPage {

    @Id
    private Integer id;
    @NotNull
    private String title;
    @NotNull
    private String explanation;

}
