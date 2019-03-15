package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.model.Employee;
@Controller
public class EmployeeController {
@RequestMapping(value="home",method=RequestMethod.GET)
public String m1()
{
	return "registrationInputPage";
}
@RequestMapping(value="registration",method=RequestMethod.GET)
public String m2(@Validated Employee e,Model model)
{
	model.addAttribute("employeeId", e.getEmployeeId());
	model.addAttribute("employeeName", e.getEmployeeName());
	model.addAttribute("emailId", e.getEmailId());
	model.addAttribute("contactNo", e.getContactNo());
	
	return "registrationOutputPage";
}
}
