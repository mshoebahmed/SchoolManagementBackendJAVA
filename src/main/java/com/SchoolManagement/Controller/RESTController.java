package com.SchoolManagement.Controller;

import java.net.URI;

import javax.sql.DataSource;

import com.SchoolManagement.Model.Student;
import com.SchoolManagement.SchoolManagement.DevRun;
import com.SchoolManagement.Service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
@RequestMapping(path = "/api")
public class RESTController {

	@Autowired
	Service service;
	
	@Autowired
	DevRun devRun;

	@Value("${runType}")
	public String runTypemethod;

	@GetMapping("/")
	public String index() {

		return null;
	}


	@GetMapping(path = "/dosomething", produces = "application/json")
	public String runDev(String id) {
		if (runTypemethod.equalsIgnoreCase("dev")) {

		}
		return  devRun.backEndRun();
	}

	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")

	public ResponseEntity<Object> addStudent(@RequestBody Student Student) {

		// Creating an ID of an Student
		// from the number of Students

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(Student.getRollNo()).toUri();

		return ResponseEntity.created(location).build();
	}

	
}
