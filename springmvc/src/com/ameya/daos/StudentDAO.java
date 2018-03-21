package com.ameya.daos;

import com.ameya.models.Student;

public interface StudentDAO {
	public void addStudent(Student student);
	public Student getStudent(int rollNo);
}
