package com.codeclan.examples.Movies.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "directors")
public class Director {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @JsonIgnoreProperties
    @OneToMany(mappedBy = "director")
    List<Film> films;


    public Director(String name) {
        this.name = name;
        this.films = new ArrayList<Film>();
    }

    public Director() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
