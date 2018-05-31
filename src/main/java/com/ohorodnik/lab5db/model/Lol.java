package com.ohorodnik.lab5db.model;

public class Lol {
    long amount;
    Professions professions;

    public Lol(long amount, Professions professions) {
        this.amount = amount;
        this.professions = professions;
    }

    public Lol() {

    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Professions getProfessions() {
        return professions;
    }

    public void setProfessions(Professions professions) {
        this.professions = professions;
    }
}
