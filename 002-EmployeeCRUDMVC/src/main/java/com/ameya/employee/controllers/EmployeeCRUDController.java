package com.ameya.employee.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ameya.employee.models.Employee;
import com.ameya.employee.services.EmployeeService;

@Controller
public class EmployeeCRUDController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
    public String startup() {
        return "index";
    }
	@RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        
        return "hello";
    }
	@RequestMapping("/login")
	public ModelAndView login(ModelMap model) {
		ModelAndView modelAndView =new ModelAndView();	
		model.addAttribute("employee", new Employee());
		modelAndView.setViewName("login");
		return modelAndView;
	}
	@RequestMapping(value="/showoptions")
    public ModelAndView showOptions(@ModelAttribute("employee")Employee employee,ModelMap model,HttpSession session) {
		model.addAttribute(employee);
		session.setAttribute("userName", employee.getUserName());
        return new ModelAndView("showoptions");
    }
	@RequestMapping(value="/addEmployee")
    public ModelAndView addEmployee(@ModelAttribute("employee")Employee employee,ModelMap model) {
		model.addAttribute(employee);
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("addemployee");
        return modelAndView;
    }
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee")Employee employee,ModelMap model) {  
	 model.addAttribute("empId", employee.getEmpId());
	 model.addAttribute("firstName",employee.getFirstName());
	 model.addAttribute("midName",employee.getMidName());
	 model.addAttribute("lastName", employee.getLastName());
	 model.addAttribute("salary", employee.getSalary());
	 model.addAttribute("userName",employee.getUserName());
	 model.addAttribute("password",employee.getPassword());
	 employeeService.addEmployee(employee);
	 return "employee-added";
	 }
	@RequestMapping(value="/viewAll")
	public ModelAndView getAllEmployees(ModelMap model){
		ModelAndView modelAndView=new ModelAndView();
		List<Employee>empList=employeeService.getAllEmployees();
		model.addAttribute("empList",empList);
		modelAndView.setViewName("viewall");
		return modelAndView;
	}
}
