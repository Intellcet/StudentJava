package ru.udsu.stud.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "group_")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Group {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameGroup")
    private String name;

    @OneToMany(mappedBy = "groupId")
    private List<Student> students;

    @OneToMany(mappedBy = "groupId")
    @JsonManagedReference
    private List<Group_Subject> subjects;

}
