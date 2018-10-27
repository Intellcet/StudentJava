package com.stud.student.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "subject")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "id", "professorId", "cathedraId"})
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "subjectName")
    private String subjectName;

    @JoinColumn(name = "cathedraId")
    private Long cathedraId;

    @OneToMany(mappedBy = "subjectId")
    //@JsonBackReference
    @JsonManagedReference
    private List<Group_Subject> groups;

}
