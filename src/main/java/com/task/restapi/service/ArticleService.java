package com.task.restapi.service;

import com.task.restapi.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article> searchArticles(String query);

}
