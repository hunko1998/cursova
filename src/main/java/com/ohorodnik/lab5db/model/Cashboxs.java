package com.ohorodnik.lab5db.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "cashboxs")
@EntityListeners(AuditingEntityListener.class)
public class Cashboxs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cashbox")
    private int idCashboxs;

    @Column(name = "freetickets")
    private String cashbox;

    public Cashboxs() {
    }

    public Cashboxs(String cashbox) {
        this.cashbox = cashbox;
    }

    public int getIdCashboxs() {
        return idCashboxs;
    }

    public void setIdCashboxs(int idCashboxs) {
        this.idCashboxs = idCashboxs;
    }

    public String getCashbox() {
        return cashbox;
    }

    public void setCashbox(String cashbox) {
        this.cashbox = cashbox;
    }

}