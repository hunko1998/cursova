package com.ohorodnik.lab5db.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "professions")
@EntityListeners(AuditingEntityListener.class)
public class Professions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prof")
    private int idProfessions;

    @Column(name = "profname")
    private String profession;

    public Professions() {
    }

    public Professions(String profession) {
        this.profession = profession;
    }

    public int getIdProfessions() {
        return idProfessions;
    }

    public void setIdProfessions(int idProfessions) {
        this.idProfessions = idProfessions;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
