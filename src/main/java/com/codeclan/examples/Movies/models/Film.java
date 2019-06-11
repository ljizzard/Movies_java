package com.codeclan.examples.Movies.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @Column
    GenreType genre;

    @ManyToMany
    @JoinTable(
            name = "film_actors",
            joinColumns = {@JoinColumn(
                    name = "film_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "actor_id",
                    nullable = false,
                    updatable = false)
            }
    )
    List<Actor> actors;

    public Film(String title, Director director, GenreType genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.actors = new ArrayList<>();
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

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public GenreType getGenre() {
        return genre;
    }

    public void setGenre(GenreType genre) {
        this.genre = genre;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor actor){
        this.actors.add(actor);
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

