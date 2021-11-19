package com.sparta.springprac02.repository;

import com.sparta.springprac02.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
