package com.springWiki.SpringWiki.api;

import com.springWiki.SpringWiki.model.mainPage;
import com.springWiki.SpringWiki.service.mainPageQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/wiki")
@RequiredArgsConstructor
public class springBootWikiController {
    private final mainPageQueryService service;

    @GetMapping
    public ResponseEntity<List<mainPage>> getCategory() {

        return new ResponseEntity<>(service.getCategory(), HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public ResponseEntity<Optional<mainPage>> getPage(@PathVariable String title) {
        return new ResponseEntity<>(service.getPage(title), HttpStatus.OK);
    }

}
