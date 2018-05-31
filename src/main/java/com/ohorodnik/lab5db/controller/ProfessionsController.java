package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Professions;
import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.repository.ProfessionsRepository;
import com.ohorodnik.lab5db.repository.RanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professions")
public class ProfessionsController {

    @Autowired
    ProfessionsRepository professionsRepository;

    @RequestMapping("/get")
    public List<Professions> getProfessions()  {
        //return buildingService.getBuildings();
        return professionsRepository.findAll();
    }

    @PostMapping("/insert")
    public Professions insertProfessions(@RequestBody Professions professions){
        //return buildingService.insertBuilding(genres);
        return professionsRepository.save(professions);
    }
    @RequestMapping("/update")
    public Professions updateProfessions(@RequestBody Professions professions, @RequestParam("id")int id)  {
        professions.setIdProfessions(id);
        return professionsRepository.save(professions);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteProfessions(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        professionsRepository.deleteById(id);
    }

}
