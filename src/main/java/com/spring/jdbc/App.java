package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My program has started!");

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//		Insert student
//		Student student = new Student();
//		student.setId(666);
//		student.setName("John Doe");
//		student.setCity("Lucknow");
//
//		int result = studentDao.insert(student);
//		System.out.println("Students added: " + result);

//		Update student
//		Student student = new Student();
//		student.setId(245);
//		student.setName("Raj Kumar");
//		student.setCity("Lucknow");
//
//		int result = studentDao.change(student);
//		System.out.println("Students updated: " + result);

//		Delete student
//		int result = studentDao.delete(666);
//		System.out.println("Students deleted: " + result);

//		Get single student
//		Student student = studentDao.getStudent(222);
//		System.out.println(student);

//		Get all students
		List<Student> students = studentDao.getAllStudents();
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
