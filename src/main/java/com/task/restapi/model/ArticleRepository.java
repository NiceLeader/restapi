package com.task.restapi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Query("SELECT p FROM Article p WHERE " +
            "p.title LIKE CONCAT('%',:query, '%')" +
            "Or p.content LIKE CONCAT('%', :query, '%')")
    List<Article> searchArticle(String query);

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Article entity);


}
