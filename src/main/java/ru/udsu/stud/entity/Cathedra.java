package ru.udsu.stud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "cathedra")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cathedra {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameCathedra")
    private String name;

    @OneToMany(mappedBy = "cathedraId")
    private List<Professor> professors;

}
