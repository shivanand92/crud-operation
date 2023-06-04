package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudService;
import com.example.demo.entity.Student;

@RestController    // it makes class as the web request handler
@RequestMapping("/api")
public class StudController {

	@Autowired
	private StudService studService;
	
	@GetMapping("/")
	public Student login(@RequestHeader String email , @RequestHeader String password) {
		return  studService.login(email, password);
	}
	
	@PostMapping("/post")
	public Student addstudent(@RequestBody Student student) {
		return studService.addStudent(student);
	}
	
	@PutMapping("/update")
	public Student updateDb(@RequestHeader String email , @RequestBody  Student  student) {
		return studService.updateDb(email,student);
	}
	
	@DeleteMapping("/del")
	public String deletedata(@RequestHeader String email ) {
		
		studService.deletedata(email);
		
		return "data deleted";
	}
	
}
