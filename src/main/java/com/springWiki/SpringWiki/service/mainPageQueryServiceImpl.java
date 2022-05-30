package com.springWiki.SpringWiki.service;

import com.springWiki.SpringWiki.model.mainPage;
import com.springWiki.SpringWiki.repository.wikiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class mainPageQueryServiceImpl implements mainPageQueryService {

    @Autowired
    private wikiRepository wikiRepository;


    @Override
    public List<mainPage> getCategory() {
        return wikiRepository.findAll();
    }

    @Override
    public Optional<mainPage> getPage(String title) {
        return wikiRepository.findAll().stream().filter(mainPage -> mainPage.getTitle().equals(title)).findFirst();
    }
}
