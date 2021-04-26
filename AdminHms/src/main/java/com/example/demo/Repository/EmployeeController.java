package com.example.demo.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.EmployeeRepo;
import com.example.demo.Model.Employee;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping("/addemployee")
	public String addguest(@RequestBody Employee employee) {
		repo.save(employee);
		return "Added employee with id :"+employee.getId();	
	}
	
	@GetMapping("/findall")
	public List<Employee> getemployee(){
		return repo.findAll();
	}
	
	@GetMapping("/findAll/{id}")
	public java.util.Optional<Employee> getemployee(@PathVariable int id){
		return repo.findById(id);
		
	}
	@DeleteMapping()
	public String deleteemployee(@PathVariable int id) {
		repo.deleteById(id);
		return " employee deleted with id :"+id;
	}
	

}
