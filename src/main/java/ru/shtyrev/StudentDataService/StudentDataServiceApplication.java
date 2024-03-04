package ru.shtyrev.StudentDataService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.shtyrev.StudentDataService.dtos.StudentDTO;
import ru.shtyrev.StudentDataService.entities.Mark;
import ru.shtyrev.StudentDataService.entities.Student;
import ru.shtyrev.StudentDataService.enums.Lesson;
import ru.shtyrev.StudentDataService.mappers.StudentMapper;

import java.util.List;

@SpringBootApplication
public class StudentDataServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentDataServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setId(1L);
		student.setName("Oleg");
		Mark mark = new Mark();
		mark.setStudent(student);
		mark.setMark(5);
		mark.setLesson(Lesson.MATH);
		student.setMarks(List.of(mark));

		StudentDTO studentDTO = StudentMapper.INSTANCE.studentToStudentDTO(student);
		System.out.println(studentDTO);
	}
}
