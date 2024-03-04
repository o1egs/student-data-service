package ru.shtyrev.StudentDataService.dtos;


import lombok.*;
import ru.shtyrev.StudentDataService.enums.Lesson;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MarkDTO {
    private Lesson lesson;
    private int mark;
}
