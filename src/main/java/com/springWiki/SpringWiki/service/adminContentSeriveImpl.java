package com.springWiki.SpringWiki.service;

import com.springWiki.SpringWiki.model.mainPage;
import com.springWiki.SpringWiki.model.underPage;
import com.springWiki.SpringWiki.request.RequestContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class adminContentSeriveImpl implements adminContentService {
    @Autowired
    private com.springWiki.SpringWiki.repository.wikiRepository wikiRepository;

    @Override
    public mainPage addContent(RequestContent requestContent) {
        mainPage mainPage = new mainPage();
        mainPage.setTitle(requestContent.getTitle());
        List<underPage> underPage = requestContent.getUnderPageList();
        mainPage.setExplanation(requestContent.getExplanation());
        mainPage.setUnderPages(underPage);

        return wikiRepository.save(mainPage);
    }

    @Override
    public int deleteContent(RequestContent requestContent) {
        return  wikiRepository.deleteByTitle(requestContent.getTitle());
    }
}
