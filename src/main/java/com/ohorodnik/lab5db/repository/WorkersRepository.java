package com.ohorodnik.lab5db.repository;


import com.ohorodnik.lab5db.model.Professions;
import com.ohorodnik.lab5db.model.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkersRepository extends JpaRepository<Workers,Integer> {
    @Query ("Select workers From Workers workers inner join Professions prof on workers.idWorkers=prof.idProfessions where workers.professions.profession Like:profession")
    List<Workers> selectWorkersSelect (@Param("profession") String profession);

    @Query ("Select workers From Workers workers  where workers.experience Like:experience")
    List<Workers> selectWorkers1Select (@Param("experience") String experience);

    @Query ("Select workers From Workers workers  where workers.gender Like:gender")
    List<Workers> selectWorkers2Select (@Param("gender") String gender);

    @Query ("Select workers From Workers workers  where workers.year Like:year")
    List<Workers> selectWorkers3Select (@Param("year")int year);

    @Query ("Select workers From Workers workers  where workers.children Like:children")
    List<Workers> selectWorkers4Select (@Param("children") int children);


    @Query ("Select workers From Workers workers  where workers.salary Like:salary")
    List<Workers> selectWorkers5Select (@Param("salary") int salary);

    @Query ("Select workers From Workers workers   ")
    List<Workers> selectWorkersSelectAll ();

    @Query ("Select workers From Workers workers inner join Professions prof on workers.idWorkers=prof.idProfessions where workers.professions.profession Like:profession")
    List<Workers> selectWorkers6Select (@Param("profession") String profession);

    @Query ("Select count(workers.idWorkers) From Workers workers  group by workers.professions.idProfessions order by workers.professions.idProfessions")
    List<Long> selectAmount ();

    @Query ("Select workers.professions From Workers workers  group by workers.professions.idProfessions order by workers.professions.idProfessions")
    List<Professions> selectProfessions ();

}
