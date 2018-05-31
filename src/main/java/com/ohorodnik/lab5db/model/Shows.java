package com.ohorodnik.lab5db.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "shows")
@EntityListeners(AuditingEntityListener.class)
public class Shows {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shows")
    private int idShows;

    @Column(name = "title")
    private String show;

    @Column(name = "seasons")
    private String seasons;

    @Column(name = "played")
    private int played;

    @Column(name = "age")
    private int age;

    @Column(name = "premier")
    private String premier;

    @Column(name = "premierdate")
    private LocalDate premierdate;



    @Column(name = "subtype")
    private String subtype;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "authors_id_authors", insertable = false, updatable = false)
    private Authors authors;

    @Column(name = "authors_id_authors")
    private int authors_idAuthors;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genres_id_genres", insertable = false, updatable = false)
    private Genres genres;

    @Column(name = "genres_id_genres")
    private int genres_idGenres;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "period_id_period", insertable = false, updatable = false)
    private Periods periods;

    @Column(name = "period_id_period")
    private int period_idPeriod;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cashbox_id_cashbox", insertable = false, updatable = false)
    private Cashboxs cashboxs;

    @Column(name = "cashbox_id_cashbox")
    private int cashbox_idCashbox;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "admin_id_admin", insertable = false, updatable = false)
    private Admins admins;

    @Column(name = "admin_id_admin")
    private int admin_idAdmin;

    public Shows() {
    }

    public Shows(String show, String seasons, int played, int age, String premier, LocalDate premierdate, String subtype, Authors authors, int authors_idAuthors, Genres genres, int genres_idGenres, Periods periods, int period_idPeriod, Cashboxs cashboxs, int cashbox_idCashbox, Admins admins, int admin_idAdmin) {
        this.show = show;
        this.seasons = seasons;
        this.played = played;
        this.age = age;
        this.premier = premier;
        this.premierdate = premierdate;
        this.subtype = subtype;
        this.authors = authors;
        this.authors_idAuthors = authors_idAuthors;
        this.genres = genres;
        this.genres_idGenres = genres_idGenres;
        this.periods = periods;
        this.period_idPeriod = period_idPeriod;
        this.cashboxs = cashboxs;
        this.cashbox_idCashbox = cashbox_idCashbox;
        this.admins = admins;
        this.admin_idAdmin = admin_idAdmin;
    }


    public int getIdShows() {
        return idShows;
    }

    public void setIdShows(int idShows) {
        this.idShows = idShows;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPremier() {
        return premier;
    }

    public void setPremier(String premier) {
        this.premier = premier;
    }

    public LocalDate getPremierdate() {
        return premierdate;
    }

    public void setPremierdate(LocalDate premierdate) {
        this.premierdate = premierdate;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public int getAuthors_idAuthors() {
        return authors_idAuthors;
    }

    public void setAuthors_idAuthors(int authors_idAuthors) {
        this.authors_idAuthors = authors_idAuthors;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public int getGenres_idGenres() {
        return genres_idGenres;
    }

    public void setGenres_idGenres(int genres_idGenres) {
        this.genres_idGenres = genres_idGenres;
    }

    public Periods getPeriods() {
        return periods;
    }

    public void setPeriods(Periods periods) {
        this.periods = periods;
    }

    public int getPeriod_idPeriod() {
        return period_idPeriod;
    }

    public void setPeriod_idPeriod(int period_idPeriod) {
        this.period_idPeriod = period_idPeriod;
    }

    public Cashboxs getCashboxs() {
        return cashboxs;
    }

    public void setCashboxs(Cashboxs cashboxs) {
        this.cashboxs = cashboxs;
    }

    public int getCashbox_idCashbox() {
        return cashbox_idCashbox;
    }

    public void setCashbox_idCashbox(int cashbox_idCashbox) {
        this.cashbox_idCashbox = cashbox_idCashbox;
    }

    public Admins getAdmins() {
        return admins;
    }

    public void setAdmins(Admins admins) {
        this.admins = admins;
    }

    public int getAdmin_idAdmin() {
        return admin_idAdmin;
    }

    public void setAdmin_idAdmin(int admin_idAdmin) {
        this.admin_idAdmin = admin_idAdmin;
    }
}
