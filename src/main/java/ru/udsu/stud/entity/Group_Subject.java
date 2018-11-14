package ru.udsu.stud.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "group_subject")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Group_Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    @JsonBackReference
    private Subject subjectId;

    @ManyToOne
    @JoinColumn(name = "groupId")
    @JsonBackReference
    private Group groupId;

}
