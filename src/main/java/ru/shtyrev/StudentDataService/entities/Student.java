package ru.shtyrev.StudentDataService.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    @OneToMany(mappedBy = "student")
    private List<Mark> marks;
}
