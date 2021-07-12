package com.example.studentmanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.studentmanagement.Domain.Course;
import com.example.studentmanagement.Domain.Student;
import com.example.studentmanagement.Service.CourseService;
import com.example.studentmanagement.Service.StudentService;


@Controller
@RequestMapping("/")
public class IndexController {
	
	 @Autowired
	 private CourseService service;
	 @Autowired
	 private StudentService services;
	 
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index()
    {
       return "index";
    }
	

	@RequestMapping(value = "/course", method = RequestMethod.GET)
 	public String viewHomePage(Model model) 
	{
		     List<Course> listcourse = service.listAll();
		     model.addAttribute("listcourse", listcourse);
		     System.out.print("Get / ");	
		     return "course";
	 }
	
    @RequestMapping(value = "/student", method = RequestMethod.GET)
	 public String viewStudentPage(Model model) 
	{
	     List<Student> liststudent = services.listAll();
	     model.addAttribute("liststudent", liststudent);
	     System.out.print("Get / ");	
	     return "Student";
	 }
 
 
}
