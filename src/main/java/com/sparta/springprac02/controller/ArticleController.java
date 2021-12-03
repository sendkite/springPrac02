package com.sparta.springprac02.controller;

import com.sparta.springprac02.domain.Article;
import com.sparta.springprac02.domain.S3Uploader;
import com.sparta.springprac02.dto.ArticleCommentRequestDto;
import com.sparta.springprac02.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleService articleService;
    private final S3Uploader s3Uploader;


    @PostMapping("/article")
    public String setArticle(@RequestParam("images")MultipartFile multipartFile) throws IOException {
        return s3Uploader.upload(multipartFile, "static");
    }

    @GetMapping("/articles")
    public List<Article> getArticles(@RequestParam(required = false) String searchTag) {
        return articleService.getArticles(searchTag);
    }

    @GetMapping("/article/{id}")
    public Article getArticle(@PathVariable Long id) {
        return articleService.getArticle(id);
    }


    @PostMapping("/article/comment")
    public void setArticleComment(@RequestBody ArticleCommentRequestDto articleCommentRequestDto) {
        articleService.setArticleComment(articleCommentRequestDto);
    }
}
