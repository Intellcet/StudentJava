package com.stud.student.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "group_")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "id"})
public class Group {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "groupNumber")
    private Long groupNumber;

    @OneToMany(mappedBy = "groupId")
    private List<Student> students;

    @ManyToMany
    @JsonManagedReference
    private List<Subject> subjects;
}
