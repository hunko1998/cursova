package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.*;
import com.ohorodnik.lab5db.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GeneralController {

    @Autowired
    GenresRepository genresRepository;




    @RequestMapping("/genres")
    public List<Genres> getGenres(){ return genresRepository.findAll(); }



    //Test Method
    @RequestMapping("/insert")
    public String getInsert(){
        //buildingRepository.save(new Building(3,3,3,4,"fgffgfg","gfgf"));

        return "Insert Fake Database!";
    }

}
