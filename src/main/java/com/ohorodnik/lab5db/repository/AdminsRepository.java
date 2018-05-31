package com.ohorodnik.lab5db.repository;


import com.ohorodnik.lab5db.model.Admins;
import com.ohorodnik.lab5db.model.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminsRepository extends JpaRepository<Admins,Integer> {

    @Query("Select admins From Admins admins  where admins.admin Like:admin")
    List<Admins> selectAdmin1 (@Param("admin") int admin);

    @Query("Select admins From Admins admins  where admins.amount Like:amount")
    List<Admins> selectAdmin2 (@Param("amount") int amount);

    @Query("Select admins From Admins admins  where admins.sold Like:sold")
    List<Admins> selectAdmin3 (@Param("sold") int amount);






}
