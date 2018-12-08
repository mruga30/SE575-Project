package com.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.beans.Student;

@Repository
public class StudentDao {
	
	  @Autowired
	  DataSource datasource;
	  
	  @Autowired
	  JdbcTemplate template;
	  public Student validateUser(Student st) {
		    String sql = "select * from student where userName='" + st.getUserName() + " ' and password='" + st.getPassword()+ "'";
		    List<Student> stu = template.query(sql, new UserMapper());
		    if(stu.size() > 0) {
		    	
		    	return stu.get(0);
		    }
		    else{
		    	return null;
		    }
	  } 
		    public void register(Student s) {
			    String sql = "insert into student values(?,?,?,?,?,?)";
			    template.update(sql, new Object[] { s.getUniversityID(), s.getFirstName(),
			    s.getLastName(), s.getPassword(),s.getEmailId(), s.getUserName()});
			    }
		   }
	  
	  
		    

		  class UserMapper implements RowMapper<Student> {
		  public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		    Student stud = new Student();
		    stud.setUniversityID(rs.getString("universityID"));
		    stud.setFirstName(rs.getString("firstName"));
		    stud.setLastName(rs.getString("lastName"));
		    stud.setPassword(rs.getString("password"));
		    stud.setEmailId(rs.getString("emailId"));
		    stud.setUserName(rs.getString("userName"));
		    
		    return stud;
		  }
		}
