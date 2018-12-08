package com.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.beans.Faculty;
import com.beans.Student;


@Repository
public class FacultyDao {
	
	@Autowired
	  DataSource datasource;
	  
	  @Autowired
	  JdbcTemplate jtemplate;
	  public Faculty validateFaculty(Faculty f) {
		    String sql = "select * from faculty where userName='" + f.getUserName() + " ' and password='" + f.getPassword()+ "'";
		    List<Faculty> stu = jtemplate.query(sql, new FacultyMapper());
		    if(stu.size() > 0) {
		    	
		    	return stu.get(0);
		    }
		    else{
		    	return null;
		    }
		   }
		  }

		  class FacultyMapper implements RowMapper<Faculty> {
		  public Faculty mapRow(ResultSet rs, int arg1) throws SQLException {
		    Faculty fac = new Faculty();
		    fac.setFacultyID(rs.getString("facultyID"));
		    fac.setFirstName(rs.getString("firstName"));
		    fac.setLastName(rs.getString("lastName"));
		    fac.setUserName(rs.getString("userName"));
		    fac.setPassword(rs.getString("password"));
		    fac.setEmailId(rs.getString("emailId"));
		    fac.setCourseId(rs.getString("courseId"));
		    
		    return fac;
		  }
		}


