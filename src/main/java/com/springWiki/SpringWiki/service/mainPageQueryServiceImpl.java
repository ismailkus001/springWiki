package com.springWiki.SpringWiki.service;

import com.springWiki.SpringWiki.dto.categoryDTO;
import com.springWiki.SpringWiki.model.mainPage;
import com.springWiki.SpringWiki.model.underPage;
import com.springWiki.SpringWiki.repository.wikiRepository;
import com.springWiki.SpringWiki.request.RequestPage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class mainPageQueryServiceImpl implements mainPageQueryService {
    @Autowired
    private wikiRepository wikiRepository;


    @Override
    public categoryDTO getCategory() {
        List<mainPage> mainPage = wikiRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(mainPage, categoryDTO.class);
    }

    @Override
    public List<underPage> getPage(RequestPage request) {
        return null;
    }
}
