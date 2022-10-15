package com.task.restapi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Article entity);
@RestResource(path = "by-title-and-content", rel = "by-title-and-content")
    List<Article> findArticlesByTitleContainingAndContentContaining(@Param("title")String title, String content);
}
