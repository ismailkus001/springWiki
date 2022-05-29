package com.springWiki.SpringWiki.api;

import com.springWiki.SpringWiki.dto.categoryDTO;
import com.springWiki.SpringWiki.service.mainPageQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class springBootWiki {
    private final mainPageQueryService service;
    private ResponseEntity<categoryDTO>

}
