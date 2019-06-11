package com.codeclan.examples.Movies.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @Column
    int salary;

    @ManyToMany
    @JoinTable(
            name = "film_actors",
            joinColumns = { @JoinColumn(
                    name = "actor_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "film_id",
                    nullable = false,
                    updatable = false)
            }
    )
    List<Film> films;

    public Actor(String name, int salary){
        this.name = name;
        this.salary = salary;
        this.films = new ArrayList<>();
    }

    public Actor(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
