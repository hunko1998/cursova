package com.ohorodnik.lab5db.model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

    @Entity
    @Table(name = "pupil")
    @EntityListeners(AuditingEntityListener.class)
    public class Pupil {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_pupil")
        private int idPupil;

        @Column(name = "pupil_name")
        private String PupilName;

        @Column(name = "school_name")
        private String SchoolName;

        @Column(name = "grade")
        private int Grade;

        @Column(name = "readers_id_readers")
        private int readers_idReaders;

        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "readers_id_readers", insertable = false, updatable = false)
        private Readers readers;

        public Pupil(String pupilName, String schoolName, int grade, int readers_idReaders, Readers readers) {
            PupilName = pupilName;
            SchoolName = schoolName;
            Grade = grade;
            this.readers_idReaders = readers_idReaders;
            this.readers = readers;
        }

        public int getIdPupil() {
            return idPupil;
        }

        public void setIdPupil(int idPupil) {
            this.idPupil = idPupil;
        }

        public String getPupilName() {
            return PupilName;
        }

        public void setPupilName(String pupilName) {
            PupilName = pupilName;
        }

        public String getSchoolName() {
            return SchoolName;
        }

        public void setSchoolName(String schoolName) {
            SchoolName = schoolName;
        }

        public int getGrade() {
            return Grade;
        }

        public void setGrade(int grade) {
            Grade = grade;
        }

        public int getReaders_idReaders() {
            return readers_idReaders;
        }

        public void setReaders_idReaders(int readers_idReaders) {
            this.readers_idReaders = readers_idReaders;
        }

        public Readers getReaders() {
            return readers;
        }

        public void setReaders(Readers readers) {
            this.readers = readers;
        }
    }


