package com.saharsh.SpringJdbc;

import com.saharsh.SpringJdbc.model.Student;
import com.saharsh.SpringJdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context =  SpringApplication.run(SpringJdbcApplication.class, args);
		Student s1 = context.getBean(Student.class);
		s1.setMarks(105);
		s1.setName("saharsh");
		s1.setRollno(1);
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s1);
		List<Student> list =  service.getStudents();
		System.out.println(list);
	}
}
