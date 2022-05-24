package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Employee;

@Service
public interface EmployeeService {
	

	 List<Employee> getAllEmployee();
	    void save(Employee employee);
	    Employee getById(Long id);
	    void deleteViaId(long id);

}
