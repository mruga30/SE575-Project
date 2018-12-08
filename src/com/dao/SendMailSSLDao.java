package com.dao;

import com.beans.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;


class Mailer{ 
	
    public static void send(final String from,final String password,String to,String sub,String courseId,String topic,String description,String date, String time){  
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);
          
          // message.setText(msg); 
           message.setContent(
              "<div align='center'><h3><br/><br/>Assignment of <b>"+courseId+"</b><br/><br/>The topic of assignment is <i>"+topic+"</i><br/><br/>" +
                      "<br><br>Following has to be done for this assignment : "+description+ "<br><br> Deadline of the assignment is "+date+ "  " +time+ " <br><br>CCI Drexel University </h3> </div>",
             "text/html");
         
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }  

  
}  
public class SendMailSSLDao{  
	
	@Autowired
	  DataSource datasource;
	  
	  @Autowired
	  JdbcTemplate jdbtemplate; 
    public  void mailing(Student s) {  
    	
    	String SQL = "select * from student where universityId = ?";
        Student student = jdbtemplate.queryForObject(SQL,new Object[]{s.getUniversityID()}, new StudentMapper());
        String email = student.getEmailId();
        
        String sql = "select * from assignment";
        List <Assignment> as = jdbtemplate.query(sql, new AssignmentMapper());
        String courseId = null;
        String topic = null;
        String description = null;
        String date = null;
        String time = null;
        for(Assignment a: as) {
        	
        	courseId = a.getCourseId();
        	topic = a.getTopic();
        	description = a.getDescription();
        	date = a.getDate();
        	time = a.getTime();
        }
        
        
    	Mailer.send("notification311@gmail.com","notif12345",email,"Assignment",courseId,topic,description,date,time);  
    
   }    
    
    
    
    
   
}   


class StudentMapper implements RowMapper<Student> {
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

class AssignmentMapper implements RowMapper<Assignment> {
	  public Assignment mapRow(ResultSet rs, int arg1) throws SQLException {
	    Assignment asg = new Assignment();
	    asg.setCourseId(rs.getString("courseId"));
	    asg.setTopic(rs.getString("topic"));
	    asg.setDescription(rs.getString("description"));
	    asg.setDate(rs.getString("date"));
	    asg.setTime(rs.getString("time"));
	    
	    return asg;
	  }
}