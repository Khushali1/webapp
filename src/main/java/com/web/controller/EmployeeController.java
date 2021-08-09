package com.web.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.entity.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String showWelcomePage() {
		System.out.println("This is welcome page..");
		return "employee";

	}

	@RequestMapping("/getEmployee")
	public String getEmployee(Model model) {
		model.addAttribute("id", 11);
		model.addAttribute("name", "Khushi");
		model.addAttribute("salary", 50000);

		return "current";

	}

	@RequestMapping(value = "/readEmployee", produces = { "application/json" })
	@ResponseBody
	public List<Employee> xmlEmployee(Model model) {

		return Arrays.asList(new Employee(121, "Khushi", 1510150), new Employee(454, "Komal", 56454000),
				new Employee(989, "Kavya", 900154));

	}

	@RequestMapping(value = "/xmlEmployee", produces = { "application/xml" })
	@ResponseBody
	public List<Employee> readEmployee(Model model) {

		return Arrays.asList(new Employee(121, "Khushi", 1510150), new Employee(454, "Komal", 56454000),
				new Employee(989, "Kavya", 900154));

	}

}
