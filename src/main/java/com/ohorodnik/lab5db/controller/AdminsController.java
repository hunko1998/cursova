package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Admins;
import com.ohorodnik.lab5db.repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminsController {

    @Autowired
    AdminsRepository adminsRepository;

    @RequestMapping("/get")
    public List<Admins> getAdmins()  {
        //return buildingService.getBuildings();
        return adminsRepository.findAll();
    }

    @PostMapping("/insert")
    public Admins insertAdmins(@RequestBody Admins admins){
        //return buildingService.insertBuilding(genres);
        return adminsRepository.save(admins);
    }
    @RequestMapping("/update")
    public Admins updateAdmins(@RequestBody Admins admins, @RequestParam("id")int id)  {
        admins.setIdAdmins(id);
        return adminsRepository.save(admins);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteAdmins(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        adminsRepository.deleteById(id);
    }

}
