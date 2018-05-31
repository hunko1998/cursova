package com.ohorodnik.lab5db.repository;

import com.ohorodnik.lab5db.model.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenresRepository extends JpaRepository<Genres,Integer> {

}
