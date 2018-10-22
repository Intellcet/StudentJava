package com.stud.student.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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
    private Set<Student> students;

    @ManyToMany
    @JoinTable(name = "subject_group",
            joinColumns = @JoinColumn(name = "groupId"),
            inverseJoinColumns = @JoinColumn(name = "subjectId"))
    private Set<Subject> subjects;

}
