package com.springWiki.SpringWiki.service;

import com.springWiki.SpringWiki.model.underPage;
import com.springWiki.SpringWiki.request.RequestPage;
import org.springframework.stereotype.Service;

import java.util.List;

public interface mainPageQueryService {
List<underPage> getPage(RequestPage request);
}
