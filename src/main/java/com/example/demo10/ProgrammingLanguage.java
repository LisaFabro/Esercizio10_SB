package com.example.demo10;

import jakarta.persistence.*;

import java.time.Year;

@Entity
@Table
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = true)
    private Year firstAppearance;
    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage(Long id, String name, Year firstAppearance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;
    }

    public ProgrammingLanguage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(Year firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstAppearance='" + firstAppearance + '\'' +
                ", inventor='" + inventor + '\'' +
                '}';
    }
}
