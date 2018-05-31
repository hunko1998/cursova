package com.ohorodnik.lab5db.repository;



import com.ohorodnik.lab5db.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Integer> {

}
