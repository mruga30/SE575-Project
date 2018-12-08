package com.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.beans.Assignment;
import com.beans.Student;
@Repository
public class AssignmentDao {
	
	@Autowired
	DataSource datasource;
	  
	@Autowired
	JdbcTemplate jbtemplate;
	
	public void assign(Assignment s) {
	    String sql = "insert into assignment values(?,?,?,?,?)";
	    jbtemplate.update(sql, new Object[] {s.getCourseId(),s.getTopic(),s.getDescription(),s.getDate(),s.getTime()});
	   
	}

}
