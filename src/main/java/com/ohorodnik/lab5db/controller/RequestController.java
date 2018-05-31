package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.Service.RequestService;
import com.ohorodnik.lab5db.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestController {

    @Autowired
    RequestService requestService;

    @RequestMapping("/request1")
    List<Workers> selectWorkersSelect(@RequestParam String profession){
        return requestService.selectWorkersSelect(profession);
    }

    @RequestMapping("/request2")
    List<Workers> selectWorkers1Select(@RequestParam String experience){
        return requestService.selectWorkers1Select(experience);
    }

    @RequestMapping("/request3")
    List<Workers> selectWorkers2Select(@RequestParam String gender){
        return requestService.selectWorkers2Select(gender);
    }

    @RequestMapping("/request4")
    List<Workers> selectWorkers3Select(@RequestParam int year){
        return requestService.selectWorkers3Select(year);
    }

    @RequestMapping("/request5")
    List<Workers> selectWorkers4Select(@RequestParam int children){
        return requestService.selectWorkers4Select(children);
    }

    @RequestMapping("/request6")
    List<Workers> selectWorkers5Select(@RequestParam int salary){
        return requestService.selectWorkers5Select(salary);
    }

    @RequestMapping("/request7")
    List<Shows> selectWorkers6Select(@RequestParam int played){
        return requestService.selectWorkers6Select(played);
    }

    @RequestMapping("/request8")
    List<Shows> selectWorkers7Select(@RequestParam String genre){
        return requestService.selectWorkers7Select(genre);
    }
    @RequestMapping("/request9")
    List<Shows> selectGenreAndPeriodFormShow(@RequestParam String genre,@RequestParam String period){
        return requestService.selectGenreAndPeriodFormShow(genre,period);
    }
    @RequestMapping("/request10")
    List<Authors> selectAuthorsCountry(@RequestParam String country){
        return requestService.selectAuthorsCountry(country);
    }

    @RequestMapping("/request11")
    List<Authors> selectAuthorsGenres(@RequestParam String genre){
        return requestService.selectAuthorsGenres(genre);
    }

    @RequestMapping("/request12")
    List<Shows> selectAuthorsShows(@RequestParam String author){
        return requestService.selectAuthorsShows(author);
    }

    @RequestMapping("/request13")
    List<Shows> selectShowsPeriod(@RequestParam String period){
        return requestService.selectShowsPeriod(period);
    }

    @RequestMapping("/request14")
    List<Admins> selectAdmin1(@RequestParam int admin){
        return requestService.selectAdmin1(admin);
    }

    @RequestMapping("/request15")
    List<Admins> selectAdmin2(@RequestParam int amount){
        return requestService.selectAdmin2(amount);
    }

    @RequestMapping("/request16")
    List<Admins> selectAdmin3(@RequestParam int sold){
        return requestService.selectAdmin3(sold);
    }

    @RequestMapping("/request17")
    List<Shows> selectShowsSub(@RequestParam String subtype){
        return requestService.selectShowsSub(subtype);
    }

    @RequestMapping("/request18")
    List<Shows> selectShowsPre(@RequestParam String premier){
        return requestService.selectShowsPre(premier);
    }

    @RequestMapping("/request19")
    List<Shows> selectShowsSelectall(){
        return requestService.selectShowsSelectall();
    }

    @RequestMapping("/request20")
    List<Lol> selectLol(){

        return requestService.selectLol();
    }






}
