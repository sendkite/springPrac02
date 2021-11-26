package com.sparta.springprac02.controller;

import com.sparta.springprac02.domain.Article;
import com.sparta.springprac02.dto.ArticleRequestDto;
import com.sparta.springprac02.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class  ArticleController {

    private final ArticleService articleService;

    @PostMapping("/article")
    public Article setArticle(@RequestBody ArticleRequestDto articleRequestDto){
        return articleService.setArticle(articleRequestDto);
    }

    @GetMapping("/articles")
    public List<Article> getArticle() {
        return articleService.getArticles();
    }
}
