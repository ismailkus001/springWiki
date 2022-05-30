package com.springWiki.SpringWiki.repository;

import com.springWiki.SpringWiki.model.mainPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface wikiRepository extends JpaRepository<mainPage, Integer> {
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM main_page WHERE title = :title", nativeQuery = true)
    int deleteByTitle(@Param("title") String title);
}
