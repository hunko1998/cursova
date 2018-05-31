package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.Cashboxs;
import com.ohorodnik.lab5db.model.Ranks;
import com.ohorodnik.lab5db.repository.CashboxsRepository;
import com.ohorodnik.lab5db.repository.RanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cashboxs")
public class CashboxsController {

    @Autowired
    CashboxsRepository cashboxsRepository;

    @RequestMapping("/get")
    public List<Cashboxs> getCashboxs()  {
        //return buildingService.getBuildings();
        return cashboxsRepository.findAll();
    }

    @PostMapping("/insert")
    public Cashboxs insertCashboxs(@RequestBody Cashboxs cashboxs){
        //return buildingService.insertBuilding(genres);
        return cashboxsRepository.save(cashboxs);
    }
    @RequestMapping("/update")
    public Cashboxs updateCashboxs(@RequestBody Cashboxs cashboxs, @RequestParam("id")int id)  {
        cashboxs.setIdCashboxs(id);
        return cashboxsRepository.save(cashboxs);
        //return buildingService.updateBuilding(genres);
    }

    @RequestMapping("/del")
    public void deleteCashboxs(@RequestParam("id")int id)  {
        //buildingService.deleteBuilding(id);
        cashboxsRepository.deleteById(id);
    }

}
