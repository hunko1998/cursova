package com.ohorodnik.lab5db.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "authors")
@EntityListeners(AuditingEntityListener.class)
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_authors")
    private int idAuthors;

    @Column(name = "authname")
    private String author;

    @Column(name = "country")
    private String country;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genres_id_genres", insertable = false, updatable = false)
    private Genres genres;

    @Column(name = "genres_id_genres")
    private Integer genres_idGenres;

    public Authors() {
    }

    public Authors(String author, String country, String country1, Genres genres, Integer genres_idGenres) {
        this.author = author;
        this.country = country;
        this.country = country1;
        this.genres = genres;
        this.genres_idGenres = genres_idGenres;
    }

    public int getIdAuthors() {
        return idAuthors;
    }

    public void setIdAuthors(int idAuthors) {
        this.idAuthors = idAuthors;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public Integer getGenres_idGenres() {
        return genres_idGenres;
    }

    public void setGenres_idGenres(Integer genres_idGenres) {
        this.genres_idGenres = genres_idGenres;
    }
}