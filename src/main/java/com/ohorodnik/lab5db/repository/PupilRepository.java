package com.ohorodnik.lab5db.repository;

import com.ohorodnik.lab5db.model.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PupilRepository extends JpaRepository<Pupil,Integer> {

}
