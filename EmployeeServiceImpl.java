package com.codegnan.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.codegnan.model.Employee;
import com.codegnan.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	private EmployeeRepository repo;


	@Override
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}


	@Override
	public Employee getEmployeeById(Long id) {
		return repo.findById(id).orElse(null);
	}


	@Override
	public void deleteEmployee(Long id) {
		repo.deleteById(id);
	}
}
