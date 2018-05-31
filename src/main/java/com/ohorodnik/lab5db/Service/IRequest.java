package com.ohorodnik.lab5db.Service;

import com.ohorodnik.lab5db.model.Admins;
import com.ohorodnik.lab5db.model.Authors;
import com.ohorodnik.lab5db.model.Shows;
import com.ohorodnik.lab5db.model.Workers;

import java.util.List;

public interface IRequest {
    List<Workers> selectWorkersSelect (String profession);
    List<Workers> selectWorkers1Select (String experience);
    List<Workers> selectWorkers2Select (String gender);
    List<Workers> selectWorkers3Select (int year);
    List<Workers> selectWorkers4Select (int children);
    List<Workers> selectWorkers5Select (int salary);
    List<Shows> selectWorkers6Select (int played);
    List<Shows> selectWorkers7Select (String genre);
    List<Shows> selectGenreAndPeriodFormShow (String genre,String period);
    List<Authors> selectAuthorsCountry (String country);
    List<Authors> selectAuthorsGenres (String genre);
    List<Shows> selectShowsPeriod (String period);
    List<Admins> selectAdmin1 (int admin);
    List<Admins> selectAdmin2 (int amount);
    List<Admins> selectAdmin3 (int sold);
    List<Shows> selectShowsSub (String subtype);
    List<Shows> selectShowsPre (String premier);
    List<Shows> selectShowsSelectall ();



}
