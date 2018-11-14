package ru.udsu.stud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "professor")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Professor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameProfessor")
    private String name;

    @JoinColumn(name = "cathedraId")
    private Long cathedraId;

    @OneToMany(mappedBy = "professorId")

    private List<Subject> subjects;

}
