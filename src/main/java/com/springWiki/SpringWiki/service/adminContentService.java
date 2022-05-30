package com.springWiki.SpringWiki.service;

import com.springWiki.SpringWiki.model.mainPage;
import com.springWiki.SpringWiki.request.RequestContent;

public interface adminContentService {
    mainPage addContent(RequestContent requestContent);
}
