package com.SchoolManagement.Controller;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import com.SchoolManagement.Model.LoginRequest;
import com.SchoolManagement.Model.Student;
import com.SchoolManagement.Model.Teacher;
import com.SchoolManagement.SchoolManagement.DevRun;
import com.SchoolManagement.Service.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.shaded.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
@CrossOrigin(origins = "http://localhost:5000")
@RequestMapping(path = "/api")
public class RESTController {

	@Autowired
	Service service;

	@Autowired
	DevRun devRun;

	@Autowired
	Student Student;

	@Autowired
	Teacher Teacher;

	@Value("${isDev}")
	public String isDev;

	@Autowired
	LoginRequest LoginRequest;



	@GetMapping("/")
	public String index() {

		return null;
	}

	@PostMapping(path = "/addStudent", consumes = "application/json")
	public Map<String, String> addPerson(@RequestBody Student newPerson) {
		System.out.println("newPerson");
		var result = new HashMap<String, String>();
		result.put("Status", "added Student");
		return result;

	}
	
	@PostMapping(path = "/login", consumes = "application/json")
	public ResponseEntity addPerson(@RequestBody Map<String, String> Request) {
		String auth = LoginRequest.validateLogin(Request.get("userName"),Request.get("password"));
		var result = new HashMap<String, String>();
		result.put("Status", auth);
		return new ResponseEntity<Object>(result, HttpStatus.OK);

	}

	@GetMapping(path = "/dosomething", produces = "application/json")
	public String runDev(String id) {
		if (isDev.equalsIgnoreCase("true")) {

		}
		return devRun.backEndRun();
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
