package com.example.springjdbcex;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springjdbcex.model.Student;
import com.example.springjdbcex.service.StudentService;

@SpringBootApplication
public class SpringjdbcexApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringjdbcexApplication.class, args);

		Student s=context.getBean(Student.class);
		s.setName("venky");
		s.setMarks(90);
		s.setRollNo(3);

		StudentService service=context.getBean(StudentService.class);
		service.add(s);

		List<Student> students=service.getStudents();

		System.out.println(students);
	}

}
