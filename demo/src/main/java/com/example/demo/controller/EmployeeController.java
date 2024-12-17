package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public ResponseEntity<Map<String, String>> getEmployee() {
		Map<String, String> employee = new HashMap<>();
		employee.put("Jonny", "Smith");
		employee.put("Sammy", "Joh");

		return ResponseEntity.ok(employee);
	}

}
