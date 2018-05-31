package com.ohorodnik.lab5db.model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

    @Entity
    @Table(name = "students")
    @EntityListeners(AuditingEntityListener.class)
    public class Students {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_students")
        private int idStudents;

        @Column(name = "student_name")
        private String StudentName;

        @Column(name = "educational_place_name")
        private String EducationalPlaceName;

        @Column(name = "faculty")
        private String Faculty;

        @Column(name = "group_number")
        private int GroupNumber;

        @Column(name = "readers_id_readers")
        private int readers_idReaders;

        public Students(String studentName, String educationalPlaceName, String faculty, int groupNumber, int readers_idReaders) {
            StudentName = studentName;
            EducationalPlaceName = educationalPlaceName;
            Faculty = faculty;
            GroupNumber = groupNumber;
            this.readers_idReaders = readers_idReaders;
        }


        public int getIdStudents() {
            return idStudents;
        }

        public void setIdStudents(int idStudents) {
            this.idStudents = idStudents;
        }

        public String getStudentName() {
            return StudentName;
        }

        public void setStudentName(String studentName) {
            StudentName = studentName;
        }

        public String getEducationalPlaceName() {
            return EducationalPlaceName;
        }

        public void setEducationalPlaceName(String educationalPlaceName) {
            EducationalPlaceName = educationalPlaceName;
        }

        public String getFaculty() {
            return Faculty;
        }

        public void setFaculty(String faculty) {
            Faculty = faculty;
        }

        public int getGroupNumber() {
            return GroupNumber;
        }

        public void setGroupNumber(int groupNumber) {
            GroupNumber = groupNumber;
        }

        public int getReaders_idReaders() {
            return readers_idReaders;
        }

        public void setReaders_idReaders(int readers_idReaders) {
            this.readers_idReaders = readers_idReaders;
        }
    }





