package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Authors;
import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.repository.AuthorsRepository;
import com.ohorodnik.lab5db.repository.RanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {

    @Autowired
    AuthorsRepository authorsRepository;

    @RequestMapping("/get")
    public List<Authors> getAuthors()  {
        //return buildingService.getBuildings();
        return authorsRepository.findAll();
    }

    @PostMapping("/insert")
    public Authors insertAuthors(@RequestBody Authors authors){
        //return buildingService.insertBuilding(genres);
        return authorsRepository.save(authors);
    }
    @RequestMapping("/update")
    public Authors updateAuthors(@RequestBody Authors authors, @RequestParam("id")int id)  {
        authors.setIdAuthors(id);
        return authorsRepository.save(authors);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteAuthors(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        authorsRepository.deleteById(id);
    }

}
