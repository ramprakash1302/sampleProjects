package com.ameya.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameya.daos.StudentDAO;
import com.ameya.models.Student;
import com.ameya.services.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;
	@Override
	public void addStudent(Student student) {
		studentDAO.addStudent(student);

	}
	@Override
	public Student getStudent(int rollNo) {
		return studentDAO.getStudent(rollNo);
	}

}
