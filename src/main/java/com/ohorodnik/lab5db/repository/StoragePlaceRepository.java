package com.ohorodnik.lab5db.repository;

import com.ohorodnik.lab5db.model.StoragePlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoragePlaceRepository extends JpaRepository<StoragePlace,Integer>{
}
