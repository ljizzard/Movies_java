package com.codeclan.examples.Movies.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "films")

public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String title;


    @JsonIgnoreProperties
    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    Director director;


    public Film(String title, Director director) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }


    public Film() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

