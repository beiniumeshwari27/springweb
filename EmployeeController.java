package com.codegnan.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.codegnan.model.Employee;
import com.codegnan.service.EmployeeService;


@Controller
@RequestMapping("/employees")
public class EmployeeController {


	@Autowired
	private EmployeeService service;


	// List employees
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		List<Employee> employees = service.getAllEmployees();
		return new ModelAndView("employee-list", "employees", employees);
	}


	// Show add form
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("employee-form", "employee", new Employee());
	}


	// Save employee
	@RequestMapping(method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		service.addEmployee(employee);
		return "redirect:/employees";
	}


	// Edit form
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editEmployee(@PathVariable Long id) {
		Employee employee = service.getEmployeeById(id);
		return new ModelAndView("employee-form", "employee", employee);
	}


	// Delete employee
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
		return "redirect:/employees";
	}
}
