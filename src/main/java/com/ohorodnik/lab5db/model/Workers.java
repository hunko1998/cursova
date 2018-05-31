package com.ohorodnik.lab5db.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "workers")
@EntityListeners(AuditingEntityListener.class)
public class Workers {
    public Workers(String name, int year, String experience, String gender, int children, int salary, Professions professions, int profession_idProf, Roles roles, int role_idRole, Tourings tourings, int touring_idTouring, Ranks ranks, int rank_idRank) {
        this.name = name;
        this.year = year;
        this.experience = experience;
        this.gender = gender;
        this.children = children;
        this.salary = salary;
        this.professions = professions;
        this.profession_idProf = profession_idProf;
        this.roles = roles;
        this.role_idRole = role_idRole;
        this.tourings = tourings;
        this.touring_idTouring = touring_idTouring;
        this.ranks = ranks;
        this.rank_idRank = rank_idRank;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_workers")
    private int idWorkers;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private int year;

    @Column(name = "experience")
    private String experience;

    @Column(name = "gender")
    private String gender;

    @Column(name = "children")
    private int children;

    @Column(name = "salary")
    private int salary;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profession_id_prof", insertable = false, updatable = false)
    private Professions professions;

    @Column(name = "profession_id_prof")
    private int profession_idProf;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id_role", insertable = false, updatable = false)
    private Roles roles;

    @Column(name = "role_id_role")
    private int role_idRole;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "touring_id_touring", insertable = false, updatable = false)
    private Tourings tourings;

    @Column(name = "touring_id_touring")
    private int touring_idTouring;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rank_id_rank", insertable = false, updatable = false)
    private Ranks ranks;

    @Column(name = "rank_id_rank")
    private int rank_idRank;

    public Workers() {
    }


    public int getIdWorkers() {
        return idWorkers;
    }

    public void setIdWorkers(int idWorkers) {
        this.idWorkers = idWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Professions getProfessions() {
        return professions;
    }

    public void setProfessions(Professions professions) {
        this.professions = professions;
    }

    public int getProfession_idProf() {
        return profession_idProf;
    }

    public void setProfession_idProf(int profession_idProf) {
        this.profession_idProf = profession_idProf;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public int getRole_idRole() {
        return role_idRole;
    }

    public void setRole_idRole(int role_idRole) {
        this.role_idRole = role_idRole;
    }

    public Tourings getTourings() {
        return tourings;
    }

    public void setTourings(Tourings tourings) {
        this.tourings = tourings;
    }

    public int getTouring_idTouring() {
        return touring_idTouring;
    }

    public void setTouring_idTouring(int touring_idTouring) {
        this.touring_idTouring = touring_idTouring;
    }

    public Ranks getRanks() {
        return ranks;
    }

    public void setRanks(Ranks ranks) {
        this.ranks = ranks;
    }

    public int getRank_idRank() {
        return rank_idRank;
    }

    public void setRank_idRank(int rank_idRank) {
        this.rank_idRank = rank_idRank;
    }
}
