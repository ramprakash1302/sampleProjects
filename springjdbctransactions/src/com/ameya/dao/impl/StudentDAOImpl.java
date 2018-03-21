package com.ameya.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ameya.dao.StudentDAO;
import com.ameya.pojo.StudentMarks;
import com.ameya.util.StudentMarksMapper;

public class StudentDAOImpl implements StudentDAO {
	private JdbcTemplate jdbcTemplate;
//	@Autowired
//	private DataSource dataSource;
	private static int id=1;
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		String SQL1="insert into Student(id,name,age) values (?,?,?)";
		String SQL2="insert into Marks(sid,marks,year) values (?,?,?)";
		try {
			jdbcTemplate.update(SQL1,id,name,age);
			jdbcTemplate.update(SQL2,id,marks,year);
			id+=1;
		}catch(DataAccessException e) {
			System.out.println("Error Creating records !!!");
			throw e;
		}
	}
	@Override
	public List<StudentMarks> listStudents() {
		String SQL3="select * from Student, Marks where Student.id=Marks.sid";
		
		List<StudentMarks> list=jdbcTemplate.query(SQL3, new StudentMarksMapper());
		
		return list;
	}

}
