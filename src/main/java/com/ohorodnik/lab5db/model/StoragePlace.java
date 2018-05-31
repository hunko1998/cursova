package com.ohorodnik.lab5db.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

    @Entity
    @Table(name = "storageplace")
    @EntityListeners(AuditingEntityListener.class)
    public class StoragePlace {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "id_storagePlace")
        private int idStoragePlace;

        @Column(name = "hall_number")
        private int HallNumber;

        @Column(name = "rack_number")
        private int RackNumber;

        @Column(name = "shelf_number")
        private int ShelfNumber;

        public StoragePlace(int hallNumber, int rackNumber, int shelfNumber) {
            HallNumber = hallNumber;
            RackNumber = rackNumber;
            ShelfNumber = shelfNumber;
        }

        public int getIdStoragePlace() {
            return idStoragePlace;
        }

        public void setIdStoragePlace(int idStoragePlace) {
            this.idStoragePlace = idStoragePlace;
        }

        public int getHallNumber() {
            return HallNumber;
        }

        public void setHallNumber(int hallNumber) {
            HallNumber = hallNumber;
        }

        public int getRackNumber() {
            return RackNumber;
        }

        public void setRackNumber(int rackNumber) {
            RackNumber = rackNumber;
        }

        public int getShelfNumber() {
            return ShelfNumber;
        }

        public void setShelfNumber(int shelfNumber) {
            ShelfNumber = shelfNumber;
        }





   /*

    spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/lab5db
spring.datasource.username=root
spring.datasource.password=root
    */
    }

