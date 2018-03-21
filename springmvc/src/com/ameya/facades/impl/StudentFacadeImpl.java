package com.ameya.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ameya.facades.StudentFacade;
import com.ameya.models.Student;
import com.ameya.services.StudentService;

@Component("studentFacade")
public class StudentFacadeImpl implements StudentFacade {
	@Autowired
	private StudentService studentService;
	@Override
	public void addStudent(Student student) {
		studentService.addStudent(student);
	}
	@Override
	public Student getStudent(int rollNo) {
		return studentService.getStudent(rollNo);
	}
}
