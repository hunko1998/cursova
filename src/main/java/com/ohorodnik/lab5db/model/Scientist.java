package com.ohorodnik.lab5db.model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

    @Entity
    @Table(name = "scientist")
    @EntityListeners(AuditingEntityListener.class)
    public class Scientist {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_scientist")
        private int idScientist;

        @Column(name = "scientist_name")
        private String ScientistName;

        @Column(name = "scientific_level")
        private String ScientificLevel;

        @Column(name = "organization_name")
        private String OrganizationName;

        @Column(name = "topic")
        private String Topic;


        public Scientist(String scientistName, String scientificLevel, String organizationName, String topic) {
            ScientistName = scientistName;
            ScientificLevel = scientificLevel;
            OrganizationName = organizationName;
            Topic = topic;
        }

        public int getIdScientist() {
            return idScientist;
        }

        public void setIdScientist(int idScientist) {
            this.idScientist = idScientist;
        }

        public String getScientistName() {
            return ScientistName;
        }

        public void setScientistName(String scientistName) {
            ScientistName = scientistName;
        }

        public String getScientificLevel() {
            return ScientificLevel;
        }

        public void setScientificLevel(String scientificLevel) {
            ScientificLevel = scientificLevel;
        }

        public String getOrganizationName() {
            return OrganizationName;
        }

        public void setOrganizationName(String organizationName) {
            OrganizationName = organizationName;
        }

        public String getTopic() {
            return Topic;
        }

        public void setTopic(String topic) {
            Topic = topic;
        }
    }




