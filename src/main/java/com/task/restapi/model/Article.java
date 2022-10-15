package com.task.restapi.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "articles")
@Getter
@Setter
public class Article  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    private String title;

    private String content;
    private LocalDate date;
    private String articlename;
    private String adnotation;
    private Timestamp timestamp;


    public Article(Long id,String title, String content, LocalDate date, String articlename, String adnotation, Timestamp timestamp) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.articlename = articlename;
        this.adnotation = adnotation;
        this.timestamp = timestamp;
    }


    public Article() {
    }



}
