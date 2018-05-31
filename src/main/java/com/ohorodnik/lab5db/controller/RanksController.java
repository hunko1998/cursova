package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Ranks;

import com.ohorodnik.lab5db.repository.RanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ranks")
public class RanksController {

    @Autowired
    RanksRepository ranksRepository;

    @RequestMapping("/get")
    public List<Ranks> getRanks()  {
        //return buildingService.getBuildings();
        return ranksRepository.findAll();
    }

    @PostMapping("/insert")
    public Ranks insertRanks(@RequestBody Ranks ranks){
        //return buildingService.insertBuilding(genres);
        return ranksRepository.save(ranks);
    }
    @RequestMapping("/update")
    public Ranks updateRanks(@RequestBody Ranks ranks, @RequestParam("id")int id)  {
        ranks.setIdRanks(id);
        return ranksRepository.save(ranks);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteRanks(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        ranksRepository.deleteById(id);
    }

}
