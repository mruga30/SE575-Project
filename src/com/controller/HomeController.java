package com.controller;
import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


import com.beans.Student;
import com.beans.Faculty;
import com.beans.StudentCourse;
import com.beans.Assignment;
import com.dao.*;

@Controller
public class HomeController {
	
	@Autowired 
	StudentDao sd;

	@RequestMapping("/")
	   public String index() {
	      return "index";
	      }
@RequestMapping("/SignIn")
public String sign(Model m) {
	m.addAttribute("Student", new Student());
   return "SignIn";
   }

@RequestMapping("/FacultySignIn")
public String signFaculty(Model mo) {
	Faculty f = new Faculty();
	mo.addAttribute("Faculty", f);
   return "FacultySignIn";
   }

@RequestMapping("/SignUp")
public String signUp(Model md) {
	md.addAttribute("sign", new Student());
   return "SignUp";
   }

@RequestMapping("/FacultyLogin")
public String assign(Model model) {
	model.addAttribute("assignment", new Assignment());
	model.addAttribute("sendmail", new Student());
   return "FacultyLogin";
   }

@RequestMapping("/StudentLogin")
public String couse(Model model) {
	model.addAttribute("course", new StudentCourse());
   return "StudentLogin";
   }

@RequestMapping(value = "/login", method = RequestMethod.POST)
public ModelAndView loginProcess(@ModelAttribute("Student") Student login) {
  ModelAndView mav = null;
  Student st = sd.validateUser(login);
  if (st != null) {
  mav = new ModelAndView("StudentLogin");
  mav.addObject("firstname", st.getFirstName());
  mav.addObject("course", new StudentCourse());
  } else {
  mav = new ModelAndView("SignIn");
  mav.addObject("message", "Username or Password is wrong!!");
  }
  return mav;
	}

@Autowired
FacultyDao fd;
@RequestMapping(value = "/loginfaculty", method = RequestMethod.POST)
public ModelAndView loginProcessFaculty(@ModelAttribute("Faculty") Faculty ft) {
  ModelAndView mav = null;
  Faculty fty = fd.validateFaculty(ft);
  if (ft != null) {
  mav = new ModelAndView("FacultyLogin");
  mav.addObject("firstname", fty.getFirstName());
  mav.addObject("lastname",fty.getLastName());
  mav.addObject("assignment", new Assignment());
  mav.addObject("sendmail", new Student());
  } else {
  mav = new ModelAndView("FacultySignIn");
  mav.addObject("message", "Username or Password is wrong!!");
  }
  return mav;
	}

@RequestMapping(value = "/signup", method = RequestMethod.POST)
public ModelAndView signUp(@ModelAttribute("sign") Student s) {
  sd.register(s);
  return new ModelAndView("index");
	}

@Autowired
AssignmentDao ad;
@RequestMapping(value = "/assign", method = RequestMethod.POST)
public ModelAndView assign(@ModelAttribute("assignment") Assignment a) {
  ad.assign(a);
  ModelAndView mv= new ModelAndView("FacultyLogin");
  mv.addObject("message","Assignment Added Successfully !! ");
  mv.addObject("sendmail", new Student());
  return mv;
	}
@Autowired
StudentCourseDao scd;
@RequestMapping(value = "/addcourse", method = RequestMethod.POST)
public ModelAndView addCourse(@ModelAttribute("course") StudentCourse sc) {
  scd.courseAdd(sc);
  ModelAndView mav = new ModelAndView("StudentLogin");
  mav.addObject("message","Course added Successfully!");
  return mav;
	}

@Autowired
SendMailSSLDao ssd;
@RequestMapping(value = "/mail", method = RequestMethod.POST)
public ModelAndView mail(@ModelAttribute("sendmail") Student s) {
  System.out.println("Hello");
  ssd.mailing(s);
  ModelAndView mav = new ModelAndView("FacultyLogin");
  mav.addObject("message","Mail sent successfully !! ");
  mav.addObject("assignment", new Assignment());
  mav.addObject("sendmail", new Student());
  return mav;
	}

}


