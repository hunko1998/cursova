package com.ohorodnik.lab5db.repository;


import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.model.Shows;
import com.ohorodnik.lab5db.model.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowsRepository extends JpaRepository<Shows,Integer> {

    @Query("Select shows From Shows shows where shows.played Like:played")
    List<Shows> selectWorkers6Select (@Param("played") int played);

    @Query ("Select shows From Shows shows  where shows.genres.genre Like:genre")
    List<Shows> selectWorkers7Select (@Param("genre") String genre);

    @Query("Select shows From Shows shows  where shows.genres.genre like:genre and shows.periods.period like:period")
    List<Shows> selectGenreAndPeriodFormShow (@Param("genre") String genre,@Param("period") String period);

    @Query ("Select shows From Shows shows  where shows.authors.author Like:author")
    List<Shows> selectAuthorsShows (@Param("author") String author);

    @Query ("Select shows From Shows shows  where shows.periods.period Like:period")
    List<Shows> selectShowsPeriod (@Param("period") String period);

    @Query ("Select shows From Shows shows  where shows.subtype Like:subtype")
    List<Shows> selectShowsSub (@Param("subtype") String subtype);

    @Query ("Select shows From Shows shows  where shows.premier Like:premier")
    List<Shows> selectShowsPre (@Param("premier") String premier);

    @Query("Select shows From Shows shows group by shows.id ")
    List<Shows> selectShowsSelectall ();
}
