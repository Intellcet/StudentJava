package com.stud.student.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "cathedra")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "id"})
public class Cathedra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cathedraName")
    private String name;

    @OneToMany(mappedBy = "cathedraId")
    private List<Professor> professors;

    @OneToMany(mappedBy = "cathedraId")
    private List<Subject> subjects;

}
