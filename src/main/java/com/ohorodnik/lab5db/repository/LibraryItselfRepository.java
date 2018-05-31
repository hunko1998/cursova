package com.ohorodnik.lab5db.repository;

import com.ohorodnik.lab5db.model.DeliveryNDeleting;
import com.ohorodnik.lab5db.model.LibraryItself;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryItselfRepository extends JpaRepository<LibraryItself,Integer> {
}
