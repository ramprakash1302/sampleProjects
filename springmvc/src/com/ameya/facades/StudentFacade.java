package com.ameya.facades;

import com.ameya.models.Student;

public interface StudentFacade {
	public void addStudent(Student student);
	public Student getStudent(int rollNo);
}
