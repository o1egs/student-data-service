package ru.shtyrev.StudentDataService.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.shtyrev.StudentDataService.dtos.*;
import ru.shtyrev.StudentDataService.entities.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDTO studentToStudentDTO(Student student);

    MarkDTO markToMarkDTO(Mark mark);

    List<MarkDTO> marksToMarkDTOs(List<Mark> marks);
}
