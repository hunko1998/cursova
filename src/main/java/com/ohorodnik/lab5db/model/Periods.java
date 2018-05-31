package com.ohorodnik.lab5db.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "periods")
@EntityListeners(AuditingEntityListener.class)
public class Periods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_period")
    private int idPeriods;

    @Column(name = "periodname")
    private String period;

    public Periods() {
    }

    public Periods(String period) {
        this.period = period;
    }

    public int getIdPeriods() {
        return idPeriods;
    }

    public void setIdPeriods(int idPeriods) {
        this.idPeriods = idPeriods;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

}

