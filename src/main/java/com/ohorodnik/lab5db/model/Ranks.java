package com.ohorodnik.lab5db.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ranks")
@EntityListeners(AuditingEntityListener.class)
public class Ranks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rank")
    private int idRanks;

    @Column(name = "namerank")
    private String rank;

    public Ranks() {
    }

    public Ranks(String rank) {
        this.rank = rank;
    }

    public int getIdRanks() {
        return idRanks;
    }

    public void setIdRanks(int idRanks) {
        this.idRanks = idRanks;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}

