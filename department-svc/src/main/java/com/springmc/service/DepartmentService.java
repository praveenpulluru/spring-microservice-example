package com.springmc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmc.entity.Department;
import com.springmc.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
