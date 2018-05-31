package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.model.Tourings;
import com.ohorodnik.lab5db.repository.RanksRepository;
import com.ohorodnik.lab5db.repository.TouringsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tourings")
public class TouringsController {

    @Autowired
    TouringsRepository touringsRepository;

    @RequestMapping("/get")
    public List<Tourings> getTourings()  {
        //return buildingService.getBuildings();
        return touringsRepository.findAll();
    }

    @PostMapping("/insert")
    public Tourings insertTourings(@RequestBody Tourings tourings){
        //return buildingService.insertBuilding(genres);
        return touringsRepository.save(tourings);
    }
    @RequestMapping("/update")
    public Tourings updateTourings(@RequestBody Tourings tourings, @RequestParam("id")int id)  {
        tourings.setIdTourings(id);
        return touringsRepository.save(tourings);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteTourings(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        touringsRepository.deleteById(id);
    }

}
