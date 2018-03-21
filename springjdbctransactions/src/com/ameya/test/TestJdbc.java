package com.ameya.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.dao.StudentDAO;
import com.ameya.dao.impl.StudentDAOImpl;
import com.ameya.pojo.StudentMarks;

public class TestJdbc {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		StudentDAO studentDao=(StudentDAOImpl)ctx.getBean("studentDao");
		
//		studentDao.create("Ameya joshi", 41, 62, 1992);
//		studentDao.create("Avani joshi", 40, 64, 1993);
//		studentDao.create("Sanjay K", 41, 65, 1992);
		
		System.out.println("---------------Listing the records ---------------");
		List<StudentMarks> list=studentDao.listStudents();
		for(StudentMarks record : list) {
			System.out.print("ID : "+record.getId());
			System.out.print(", Name : "+record.getName());
			System.out.print(", Marks : "+record.getMarks());
			System.out.print(", Year : "+record.getYear());
			System.out.println(", Age : "+record.getAge());
		}
	}

}
