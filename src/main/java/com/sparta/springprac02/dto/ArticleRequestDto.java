package com.sparta.springprac02.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
public class ArticleRequestDto {
    private String title;
    private String content;
    private MultipartFile img;
    private String tags;
}
