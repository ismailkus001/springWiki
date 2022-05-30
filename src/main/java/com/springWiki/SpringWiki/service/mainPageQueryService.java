package com.springWiki.SpringWiki.service;

import com.springWiki.SpringWiki.model.mainPage;

import java.util.List;
import java.util.Optional;

public interface mainPageQueryService {
    List<mainPage> getCategory();


    Optional<mainPage> getPage(String title);
}
