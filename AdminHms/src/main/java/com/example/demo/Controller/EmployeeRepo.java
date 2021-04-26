package com.example.demo.Controller;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, Integer>{

}
