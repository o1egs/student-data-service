package ru.shtyrev.StudentDataService.entities;

import jakarta.persistence.*;
import lombok.*;
import ru.shtyrev.StudentDataService.enums.Lesson;

@Entity
@Table(name = "marks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mark {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
    private Lesson lesson;
    private int mark;
}
