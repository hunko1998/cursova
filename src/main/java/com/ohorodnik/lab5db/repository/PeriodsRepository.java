package com.ohorodnik.lab5db.repository;


import com.ohorodnik.lab5db.model.Periods;
import com.ohorodnik.lab5db.model.Ranks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodsRepository extends JpaRepository<Periods,Integer> {

}
