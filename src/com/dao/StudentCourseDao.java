package com.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.beans.*;

@Repository
public class StudentCourseDao {
	
	 @Autowired
	  DataSource datasource;
	  
	  @Autowired
	  JdbcTemplate jdtemplate;
	  
	  public void courseAdd(StudentCourse s) {
		    String sql = "insert into studentcourse values(?,?,?,?)";
		    jdtemplate.update(sql, new Object[] { s.getUniversityID(), s.getCourseId1(),
		    		s.getCourseId1(), s.getCourseId1()});
		    }

}

