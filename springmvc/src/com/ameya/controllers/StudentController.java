package com.ameya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ameya.facades.StudentFacade;
import com.ameya.models.Student;

@Controller
public class StudentController {
	@Autowired
	StudentFacade studentFacade;
	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}
	@RequestMapping(value="/addStudent",method=RequestMethod.GET)
	public ModelAndView student(Model model) {
		ModelAndView modelAndView=new ModelAndView();
		model.addAttribute("student",new Student());
		modelAndView.setViewName("studententry");
		return modelAndView;
	}
	@RequestMapping(value="/saveStudent",method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student,ModelMap model) {
		studentFacade.addStudent(student);
		model.addAttribute("rollNo",student.getRollNo());
		model.addAttribute("firstName", student.getFirstName());
		model.addAttribute("lastName", student.getLastName());
		model.addAttribute("percent", student.getPercent());
		return "student-added";
	}
	@RequestMapping(value="/searchStudent",method=RequestMethod.GET)
	public ModelAndView getRollNo(@ModelAttribute("student")Student student,Model model) {
		model.addAttribute(student);
		return new ModelAndView("searchstudent");
	}
	@RequestMapping(value="/getStudent",method=RequestMethod.POST)
	public String getStudent(@ModelAttribute("rollNo")int rollNo,ModelMap model) {
		Student student=studentFacade.getStudent(rollNo);
		model.addAttribute("student", student);
		return "student-data";
	}
}
