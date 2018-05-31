package com.ohorodnik.lab5db.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "tourings")
@EntityListeners(AuditingEntityListener.class)
public class Tourings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_touring")
    private int idTourings;

    @Column(name = "city")
    private String city;

    @Column(name = "month")
    private String month;

    public Tourings() {
    }

    public Tourings(String city, String month) {
        this.city = city;
        this.month = month;
    }


    public int getIdTourings() {
        return idTourings;
    }

    public void setIdTourings(int idTourings) {
        this.idTourings = idTourings;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}