package com.stud.student.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "professor")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "id", "cathedraId"})
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "professorName")
    private String name;

    @JoinColumn(name = "cathedraId")
    private Long cathedraId;

}
