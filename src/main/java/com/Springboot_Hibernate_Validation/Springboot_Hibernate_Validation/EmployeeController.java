package com.Springboot_Hibernate_Validation.Springboot_Hibernate_Validation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeRepository erepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return "This is a validation test";
	}
	
	@RequestMapping("/save")
	public String savedata(@RequestBody Employee e)
	{
		erepo.save(e);
		return "Data Saved";
	}
	
	@RequestMapping("/show")
	public List<Employee> showdata()
	{
		return erepo.findAll();
	}
}
