package ru.shtyrev.StudentDataService.services;

import ru.shtyrev.StudentDataService.dtos.*;

import java.util.List;

public interface StudentService {
    StudentDTO createStudent(StudentDTO studentDTO);

    void addMark(Long studentId, MarkDTO markDTO);

    List<StudentDTO> findAllStudents();
}
