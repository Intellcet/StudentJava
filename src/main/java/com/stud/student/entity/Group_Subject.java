package com.stud.student.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "group_subject")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
class Group_Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "groupId")
    @JsonBackReference
    private Group groupId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    @JsonBackReference
    private Subject subjectId;



}
