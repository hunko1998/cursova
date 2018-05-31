package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Periods;
import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.repository.PeriodsRepository;
import com.ohorodnik.lab5db.repository.RanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/periods")
public class PeriodsController {

    @Autowired
    PeriodsRepository periodsRepository;

    @RequestMapping("/get")
    public List<Periods> getPeriods()  {
        //return buildingService.getBuildings();
        return periodsRepository.findAll();
    }

    @PostMapping("/insert")
    public Periods insertPeriods(@RequestBody Periods periods){
        //return buildingService.insertBuilding(genres);
        return periodsRepository.save(periods);
    }
    @RequestMapping("/update")
    public Periods updatePeriods(@RequestBody Periods periods, @RequestParam("id")int id)  {
        periods.setIdPeriods(id);
        return periodsRepository.save(periods);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deletePeriods(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        periodsRepository.deleteById(id);
    }

}
