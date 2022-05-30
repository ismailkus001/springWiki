package com.springWiki.SpringWiki.request;

import com.springWiki.SpringWiki.model.underPage;
import lombok.Data;

import java.util.List;

@Data
public class RequestContent {
    private String title;
    private String explanation;
    private List<underPage> underPageList;

}
