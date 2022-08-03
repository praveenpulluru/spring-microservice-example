package com.springmc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springmc.entity.User;
import com.springmc.repository.UserRepository;
import com.springmc.user.vo.Department;
import com.springmc.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment of UserService");
		ResponseTemplateVO resp = new ResponseTemplateVO();
		
		User user =  userRepository.findByUserId(userId);
		resp.setUser(user);
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		resp.setDepartment(department);
		
		return resp;
	}
}
