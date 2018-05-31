package com.ohorodnik.lab5db.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

    @Entity
    @Table(name = "deliveryndeleting")
    @EntityListeners(AuditingEntityListener.class)
    public class DeliveryNDeleting {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "id_deliveryndeleting")
        private int idDeliveryNDeleting;

        @Column(name = "book_name")
        private String BookName;

        @Column(name = "delivery_date")
        private Date DeliveryDate;

        @Column(name = "deleting_date")
        private Date DeletingDate;

        public DeliveryNDeleting(String bookName, Date deliveryDate, Date deletingDate) {
            BookName = bookName;
            DeliveryDate = deliveryDate;
            DeletingDate = deletingDate;
        }

        public int getIdDeliveryNDeleting() {
            return idDeliveryNDeleting;
        }

        public void setIdDeliveryNDeleting(int idDeliveryNDeleting) {
            this.idDeliveryNDeleting = idDeliveryNDeleting;
        }

        public String getBookName() {
            return BookName;
        }

        public void setBookName(String bookName) {
            BookName = bookName;
        }

        public Date getDeliveryDate() {
            return DeliveryDate;
        }

        public void setDeliveryDate(Date deliveryDate) {
            DeliveryDate = deliveryDate;
        }

        public Date getDeletingDate() {
            return DeletingDate;
        }

        public void setDeletingDate(Date deletingDate) {
            DeletingDate = deletingDate;
        }


        ////
   /*

    spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/lab5db
spring.datasource.username=root
spring.datasource.password=root
    */
    }

