package com.springWiki.SpringWiki.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.springWiki.SpringWiki.model.mainPage;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.ref.PhantomReference;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class categoryDTO {
    @JsonIgnoreProperties(value = {"descripton","explanation"})
    private mainPageDTO mainPageDTO;
}
