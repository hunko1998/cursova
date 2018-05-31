package com.ohorodnik.lab5db.model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "readers")
@EntityListeners(AuditingEntityListener.class)
public class Readers {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_readers")
    private int idReaders;


    public int getIdReaders() {
        return idReaders;
    }

    public void setIdReaders(int idReaders) {
        this.idReaders = idReaders;
    }




   /*

    spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/lab5db
spring.datasource.username=root
spring.datasource.password=root
    */
}
