package com.codeclan.examples.Movies.Repositories;

import com.codeclan.examples.Movies.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
