package com.springWiki.SpringWiki.api;

import com.springWiki.SpringWiki.model.mainPage;
import com.springWiki.SpringWiki.request.RequestContent;
import com.springWiki.SpringWiki.service.adminContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/wiki/adminContent")
public class adminContent {
    private final adminContentService service;


    @PostMapping("/add")
    public ResponseEntity<mainPage> addContent(@RequestBody RequestContent requestContent) {

        return new ResponseEntity<>(service.addContent(requestContent), HttpStatus.OK);
    }

}
