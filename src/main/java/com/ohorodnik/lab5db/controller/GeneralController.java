package com.ohorodnik.lab5db.controller;


import com.ohorodnik.lab5db.model.*;
import com.ohorodnik.lab5db.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GeneralController {

    @Autowired
    GenresRepository genresRepository;

    @Autowired
    DeliveryNDeletingRepository deliveryNDeletingRepository;

    @Autowired
    LibrarianRepository librarianRepository;

    @Autowired
    LibraryItselfRepository libraryItselfRepository;

    @Autowired
    PupilRepository pupilRepository;

    @Autowired
    ReadersRepository readersRepository;

    @Autowired
    ScientistRepository scientistRepository;

    @Autowired
    StoragePlaceRepository storagePlaceRepository;

    @Autowired
    StudentRepository studentRepository;


    @RequestMapping("/genres")
    public List<Genres> getGenres(){ return genresRepository.findAll(); }

    @RequestMapping("/deliveryndeleting")
    public List<DeliveryNDeleting> getDeliveryNDeleting(){ return deliveryNDeletingRepository.findAll(); }

    @RequestMapping("/librarian")
    public List<Librarian> Librarian(){ return librarianRepository.findAll(); }

    @RequestMapping("/libraryitself")
    public List<LibraryItself> getLirbaryItself(){ return libraryItselfRepository.findAll(); }

    @RequestMapping("/pupil")
    public List<Pupil> getPupil(){ return pupilRepository.findAll(); }

    @RequestMapping("/readers")
    public List<Readers> getReaders(){ return readersRepository.findAll(); }

    @RequestMapping("/scientist")
    public List<Scientist> getScientist(){ return scientistRepository.findAll(); }

    @RequestMapping("/storageplace")
    public List<StoragePlace> getStoragePlace(){ return storagePlaceRepository.findAll(); }

    @RequestMapping("/student")
    public List<Students> getStudent(){ return studentRepository.findAll(); }

    //Test Method
    @RequestMapping("/insert")
    public String getInsert(){
        //buildingRepository.save(new Building(3,3,3,4,"fgffgfg","gfgf"));

        return "Insert Fake Database!";
    }

}
