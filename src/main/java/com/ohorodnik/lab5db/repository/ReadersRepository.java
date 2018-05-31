package com.ohorodnik.lab5db.repository;

import com.ohorodnik.lab5db.model.Readers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadersRepository extends JpaRepository<Readers,Integer> {

}
