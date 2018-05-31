package com.ohorodnik.lab5db.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "admins")
@EntityListeners(AuditingEntityListener.class)
public class Admins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private int idAdmins;

    @Column(name = "soldtickets")
    private int admin;

    @Column(name = "amount")
    private int amount;

    @Column(name = "previouslysold")
    private int sold;

    public Admins() {
    }

    public Admins(int admin, int amount, int sold) {
        this.admin = admin;
        this.amount = amount;
        this.sold = sold;
    }

    public int getIdAdmins() {
        return idAdmins;
    }

    public void setIdAdmins(int idAdmins) {
        this.idAdmins = idAdmins;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

}