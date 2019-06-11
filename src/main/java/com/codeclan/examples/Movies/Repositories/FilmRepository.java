package com.codeclan.examples.Movies.Repositories;

import com.codeclan.examples.Movies.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
