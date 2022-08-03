package com.springmc.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "UserService is taking longer than expected.Please try again later";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "DepartmentService is taking longer than expected.Please try again later";
	}
}
