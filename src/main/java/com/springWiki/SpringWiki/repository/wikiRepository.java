package com.springWiki.SpringWiki.repository;

import com.springWiki.SpringWiki.model.mainPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface wikiRepository extends JpaRepository<mainPage, Integer> {
}
