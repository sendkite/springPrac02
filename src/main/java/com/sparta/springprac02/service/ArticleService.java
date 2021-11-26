package com.sparta.springprac02.service;

import com.sparta.springprac02.domain.Article;
import com.sparta.springprac02.dto.ArticleRequestDto;
import com.sparta.springprac02.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Article setArticle(ArticleRequestDto articleRequestDto){
        Article article = new Article();
        article.setTitle(articleRequestDto.getTitle());
        article.setContent(articleRequestDto.getContent());
        article.setTags(articleRequestDto.getTags());
        articleRepository.save(article);
        return article;
    }

    public List<Article> getArticles(){
        return articleRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}

