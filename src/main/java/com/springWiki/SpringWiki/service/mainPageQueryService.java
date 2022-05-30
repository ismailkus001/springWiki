package com.springWiki.SpringWiki.service;

import com.springWiki.SpringWiki.dto.categoryDTO;
import com.springWiki.SpringWiki.model.underPage;
import com.springWiki.SpringWiki.request.RequestPage;

import java.util.List;

public interface mainPageQueryService {
    categoryDTO getCategory();

    List<underPage> getPage(RequestPage request);
}
