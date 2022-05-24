package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.EmployeeRepository;
import com.example.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		empRepo.save(employee);
	}

	@Override
	public Employee getById(Long id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = empRepo.findById(id);
		Employee employee = null;
		if (optional.isPresent())
			employee = optional.get();
		else
			throw new RuntimeException("Employee not found for id : " + id);
		return employee;
	}

	@Override
	public void deleteViaId(long id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
	}

}
