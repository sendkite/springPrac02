package com.sparta.springprac02.controller;

import com.sparta.springprac02.domain.Article;
import com.sparta.springprac02.dto.ArticleRequestDto;
import com.sparta.springprac02.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping("/article")
    public Article setArticle(@RequestBody ArticleRequestDto articleRequestDto){
        return articleService.setArticle(articleRequestDto);
    }

    @GetMapping("/article/{id}")
    public Article getArticle(@PathVariable Long id){
        return articleService.getArticle(id);
    }
}
