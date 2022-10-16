package com.task.restapi.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "articles")
@Getter
@Setter
@ToString
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "created_at")
    private LocalDate date;
    @Column(name = "magazinename")
    private String magazinename;
    @Column(name = "annotation")
    private String annotation;
    @Column(name = "timestamp")
    private Timestamp timestamp;


    public Article(Long id, String title, String content, LocalDate date, String magazinename, String annotation, Timestamp timestamp) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.magazinename = magazinename;
        this.annotation = annotation;
        this.timestamp = timestamp;
    }


    public Article() {
    }


}
