package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.model.Roles;
import com.ohorodnik.lab5db.repository.RanksRepository;
import com.ohorodnik.lab5db.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    RolesRepository rolesRepository;

    @RequestMapping("/get")
    public List<Roles> getRoles()  {
        //return buildingService.getBuildings();
        return rolesRepository.findAll();
    }

    @PostMapping("/insert")
    public Roles insertRoles(@RequestBody Roles roles){
        //return buildingService.insertBuilding(genres);
        return rolesRepository.save(roles);
    }
    @RequestMapping("/update")
    public Roles updateRoles(@RequestBody Roles roles, @RequestParam("id")int id)  {
        roles.setIdRoles(id);
        return rolesRepository.save(roles);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteRoles(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        rolesRepository.deleteById(id);
    }

}
