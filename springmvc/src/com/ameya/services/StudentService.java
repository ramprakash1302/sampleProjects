package com.ameya.services;

import com.ameya.models.Student;

public interface StudentService {
	public void addStudent(Student student);
	public Student getStudent(int rollNo);
}
