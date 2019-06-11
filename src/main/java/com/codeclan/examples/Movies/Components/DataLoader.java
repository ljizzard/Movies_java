package com.codeclan.examples.Movies.Components;

import com.codeclan.examples.Movies.Repositories.DirectorRepository;
import com.codeclan.examples.Movies.Repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    DirectorRepository directorRepository;

    @Autowired
    FilmRepository filmRepository;



}
