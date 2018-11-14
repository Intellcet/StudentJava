package ru.udsu.stud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "subject")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Subject {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameSubject")
    private String name;

    @JoinColumn(name = "professorId")
    private Long professorId;

    @OneToMany(mappedBy = "subjectId")
    @JsonManagedReference
    private List<Group_Subject> groups;

}
