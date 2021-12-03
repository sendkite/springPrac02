package com.sparta.springprac02.repository;

import com.sparta.springprac02.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findAllByTagsName(String name);
}
