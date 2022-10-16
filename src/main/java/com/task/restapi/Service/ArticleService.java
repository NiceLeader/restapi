package com.task.restapi.Service;

import com.task.restapi.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article> searchArticles(String query);
    
    Article createArticle(Article article);
}
