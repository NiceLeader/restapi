package com.task.restapi.controller;


import com.task.restapi.service.ArticleService;
import com.task.restapi.model.Article;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Article>> searchArticles(@RequestParam("query") String query) {
        return ResponseEntity.ok(articleService.searchArticles(query));
    }



}
