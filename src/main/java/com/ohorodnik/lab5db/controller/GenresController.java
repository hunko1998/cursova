package com.ohorodnik.lab5db.controller;

import com.ohorodnik.lab5db.model.Genres;
import com.ohorodnik.lab5db.repository.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenresController {

    @Autowired
    GenresRepository genresRepository;

    @RequestMapping("/get")
    public List<Genres> getGenres()  {
        //return buildingService.getBuildings();
        return genresRepository.findAll();
    }

    @PostMapping("/insert")
    public Genres insertGenres(@RequestBody Genres genres){
        //return buildingService.insertBuilding(genres);
        return genresRepository.save(genres);
    }
    @RequestMapping("/update")
    public Genres updateGenres(@RequestBody Genres genres, @RequestParam("id")int id)  {
        genres.setIdGenres(id);
        return genresRepository.save(genres);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteGenres(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        genresRepository.deleteById(id);
    }

}
