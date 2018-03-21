package com.ameya.daos.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ameya.daos.StudentDAO;
import com.ameya.models.Student;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jdbcTemplate;
	@Autowired
	private DataSource dataSource;
	@Override
	public void addStudent(Student student) {
		try {
		jdbcTemplate=new JdbcTemplate(dataSource);
		final String SQL="insert into Student values (?,?,?,?)";
		jdbcTemplate.update(SQL,
				student.getRollNo(),
				student.getFirstName(),
				student.getLastName(),
				student.getPercent());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Student getStudent(int rollNo) {
		jdbcTemplate=new JdbcTemplate(dataSource);
		final String SQL="select * from Student where rollno = ?";
		Student student=jdbcTemplate.queryForObject(SQL,new Object[] {rollNo},
				new RowMapper<Student>() {
					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
						Student student=new Student();
						student.setRollNo(rs.getInt("rollno"));
						student.setFirstName(rs.getString("firstname"));
						student.setLastName(rs.getString("lastName"));
						student.setPercent(rs.getDouble("percent"));
						return student;
					}
		});
		
		return student;
	}

}
