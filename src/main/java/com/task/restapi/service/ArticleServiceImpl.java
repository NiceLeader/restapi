package com.task.restapi.service;

import com.task.restapi.model.Article;
import com.task.restapi.model.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articlerepository;


    @Override
    public List<Article> searchArticles(String query) {
        List<Article> articles = articlerepository.searchArticle(query);
        return articles;
    }

}
