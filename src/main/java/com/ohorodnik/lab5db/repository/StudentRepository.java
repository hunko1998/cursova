package com.ohorodnik.lab5db.repository;

import com.ohorodnik.lab5db.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {

}
