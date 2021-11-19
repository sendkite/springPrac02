package com.sparta.springprac02.service;

import com.sparta.springprac02.domain.Article;
import com.sparta.springprac02.dto.ArticleRequestDto;
import com.sparta.springprac02.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Article setArticle(ArticleRequestDto articleRequestDto){
        Article article = new Article();
        article.setContent(articleRequestDto.getContent());
        articleRepository.save(article);
        return article;
    }

    public Article getArticle(Long id){
        return articleRepository.findById(id).get();
    }
}

