package com.ohorodnik.lab5db.repository;


import com.ohorodnik.lab5db.model.Authors;
import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.model.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorsRepository extends JpaRepository<Authors,Integer> {
    @Query("Select authors From Authors authors  where authors.country Like:country")
    List<Authors> selectAuthorsCountry (@Param("country") String country);

    @Query("Select authors From Authors authors  where genres.genre Like:genre")
    List<Authors> selectAuthorsGenres (@Param("genre") String genre);

}
