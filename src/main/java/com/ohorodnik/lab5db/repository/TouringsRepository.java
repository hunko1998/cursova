package com.ohorodnik.lab5db.repository;


import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.model.Tourings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouringsRepository extends JpaRepository<Tourings,Integer> {

}
