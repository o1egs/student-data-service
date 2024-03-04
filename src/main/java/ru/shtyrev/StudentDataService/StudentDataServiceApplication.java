package ru.shtyrev.StudentDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.shtyrev.StudentDataService.dtos.MarkDTO;
import ru.shtyrev.StudentDataService.dtos.StudentDTO;
import ru.shtyrev.StudentDataService.entities.Mark;
import ru.shtyrev.StudentDataService.entities.Student;
import ru.shtyrev.StudentDataService.enums.Lesson;
import ru.shtyrev.StudentDataService.mappers.StudentMapper;
import ru.shtyrev.StudentDataService.services.StudentService;

import java.util.List;

@SpringBootApplication
public class StudentDataServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentDataServiceApplication.class, args);
    }
}
