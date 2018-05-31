package com.ohorodnik.lab5db.Service;

import com.ohorodnik.lab5db.model.*;
import com.ohorodnik.lab5db.repository.AdminsRepository;
import com.ohorodnik.lab5db.repository.AuthorsRepository;
import com.ohorodnik.lab5db.repository.ShowsRepository;
import com.ohorodnik.lab5db.repository.WorkersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequestService implements IRequest {
    @Autowired
    WorkersRepository workersRepository;
    @Autowired
    ShowsRepository showsRepository;
    @Autowired
    AuthorsRepository authorsRepository;
    @Autowired
    AdminsRepository adminsRepository;
    @Override
    public List<Workers> selectWorkersSelect(String profession) {
        return workersRepository.selectWorkersSelect(profession);
    }
    public List<Workers> selectWorkers1Select(String experience) {
        return workersRepository.selectWorkers1Select(experience);
    }
    public List<Workers> selectWorkers2Select(String gender) {
        return workersRepository.selectWorkers2Select(gender);

    } public List<Workers> selectWorkers3Select(int year) {
        return workersRepository.selectWorkers3Select(year);
    }
    public List<Workers> selectWorkers4Select(int children) {
        return workersRepository.selectWorkers4Select(children);
    }
    public List<Workers> selectWorkers5Select(int salary) {
        return workersRepository.selectWorkers5Select(salary);
    }
    public List<Shows> selectWorkers6Select(int played) {
        return showsRepository.selectWorkers6Select(played);
    }
    public List<Shows> selectWorkers7Select(String genre) {
        return showsRepository.selectWorkers7Select(genre);
    }
    public List<Shows> selectGenreAndPeriodFormShow(String genre,String period) {
        return showsRepository.selectGenreAndPeriodFormShow(genre,period);
    }
    public List<Authors> selectAuthorsCountry(String country) {
        return authorsRepository.selectAuthorsCountry(country);
    }
    public List<Authors> selectAuthorsGenres(String genre) {
        return authorsRepository.selectAuthorsGenres(genre);
    }
    public List<Shows> selectAuthorsShows(String author) {
        return showsRepository.selectAuthorsShows(author);
    }

    public List<Shows> selectShowsPeriod(String period) {
        return showsRepository.selectShowsPeriod(period);
    }

    public List<Admins> selectAdmin1(int admin) {
        return adminsRepository.selectAdmin1(admin);
    }

    public List<Admins> selectAdmin2(int amount) {

        return adminsRepository.selectAdmin2(amount);
    }

    public List<Admins> selectAdmin3(int sold) {
        return adminsRepository.selectAdmin3(sold);
    }

    public List<Shows> selectShowsSub(String subtype) {
        return showsRepository.selectShowsSub(subtype);
    }

    public List<Shows> selectShowsPre(String premier) {
        return showsRepository.selectShowsPre(premier);
    }

    public List<Shows> selectShowsSelectall() {
        return showsRepository.selectShowsSelectall();
    }

    public List<Lol> selectLol() {
        List<Long>amount = workersRepository.selectAmount();
        List<Professions>professions=workersRepository.selectProfessions();
        List<Lol>list = new ArrayList<>();
        for (int i = 0; i < amount.size() ; i++) {
            list.add(new Lol(amount.get(i),professions.get(i)));
        }
        return list;
    }




}
