package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.model.Workers;
import com.ohorodnik.lab5db.repository.RanksRepository;
import com.ohorodnik.lab5db.repository.WorkersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkersController {

    @Autowired
    WorkersRepository workersRepository;

    @RequestMapping("/get")
    public List<Workers> getWorkers()  {
        //return buildingService.getBuildings();
        return workersRepository.findAll();
    }

    @PostMapping("/insert")
    public Workers insertWorkers(@RequestBody Workers workers){
        //return buildingService.insertBuilding(genres);
        return workersRepository.save(workers);
    }
    @RequestMapping("/update")
    public Workers updateWorkers(@RequestBody Workers workers, @RequestParam("id")int id)  {
        workers.setIdWorkers(id);
        return workersRepository.save(workers);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteWorkers(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        workersRepository.deleteById(id);
    }

}
