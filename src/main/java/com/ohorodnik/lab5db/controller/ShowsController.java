package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.model.Shows;
import com.ohorodnik.lab5db.repository.RanksRepository;
import com.ohorodnik.lab5db.repository.ShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shows")
public class ShowsController {

    @Autowired
    ShowsRepository showsRepository;

    @RequestMapping("/get")
    public List<Shows> getShows()  {
        //return buildingService.getBuildings();
        return showsRepository.findAll();
    }

    @PostMapping("/insert")
    public Shows insertRanks(@RequestBody Shows shows){
        //return buildingService.insertBuilding(genres);
        return showsRepository.save(shows);
    }
    @RequestMapping("/update")
    public Shows updateShows(@RequestBody Shows shows, @RequestParam("id")int id)  {
        shows.setIdShows(id);
        return showsRepository.save(shows);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteShows(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        showsRepository.deleteById(id);
    }

}
