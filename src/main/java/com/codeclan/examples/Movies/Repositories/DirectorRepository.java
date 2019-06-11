package com.codeclan.examples.Movies.Repositories;

import com.codeclan.examples.Movies.models.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director,Long> {
}
