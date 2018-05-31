package com.ohorodnik.lab5db.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
    @Table(name = "libraryitself")
    @EntityListeners(AuditingEntityListener.class)
    public class LibraryItself {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_libraryitself")
        private int idLibraryItself;

        @Column(name = "visiting_date")
        private LocalDate VisitingDate;

        @Column(name = "issuing_date")
        private LocalDate IssuingDate;

        @Column(name = "readers_id_readers")
        private int readers_idReaders;

        @Column(name = "book_id_book")
        private int book_idBook;

        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "readers_id_readers", insertable = false, updatable = false)
        private Readers readers;

        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "book_id_book", insertable = false, updatable = false)
        private Genres book;

        public LibraryItself(LocalDate visitingDate, LocalDate issuingDate, int readers_idReaders, int book_idBook, Readers readers, Genres book) {
            VisitingDate = visitingDate;
            IssuingDate = issuingDate;
            this.readers_idReaders = readers_idReaders;
            this.book_idBook = book_idBook;
            this.readers = readers;
            this.book = book;
        }

        public int getIdLibraryItself() {
            return idLibraryItself;
        }

        public void setIdLibraryItself(int idLibraryItself) {
            this.idLibraryItself = idLibraryItself;
        }

        public LocalDate getVisitingDate() {
            return VisitingDate;
        }

        public void setVisitingDate(LocalDate visitingDate) {
            VisitingDate = visitingDate;
        }

        public LocalDate getIssuingDate() {
            return IssuingDate;
        }

        public void setIssuingDate(LocalDate issuingDate) {
            IssuingDate = issuingDate;
        }

        public int getReaders_idReaders() {
            return readers_idReaders;
        }

        public void setReaders_idReaders(int readers_idReaders) {
            this.readers_idReaders = readers_idReaders;
        }

        public int getBook_idBook() {
            return book_idBook;
        }

        public void setBook_idBook(int book_idBook) {
            this.book_idBook = book_idBook;
        }

        public Readers getReaders() {
            return readers;
        }

        public void setReaders(Readers readers) {
            this.readers = readers;
        }

        public Genres getBook() {
            return book;
        }

        public void setBook(Genres book) {
            this.book = book;
        }
    }