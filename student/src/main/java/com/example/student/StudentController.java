package com.example.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping(value="/studentdetails")
	public String show(@RequestBody Student a) {
		 
		 return ss.show(a);
	}
	@PostMapping("/details") 
	public String showw(@RequestBody List<Student> a) {
		return ss.showw(a);
	}
	@GetMapping("/show")
	public List<Student> shows() {
		return ss.shows();
	}
	@GetMapping("/shows/{a}") 
		public Optional<Student> showss(@PathVariable int a) {
			return ss.showss(a);
		
	}
	@GetMapping("/department/{a}") 
	public List<Student> getByDepartment(@PathVariable String a) {
		return ss.getByDepartment(a);
	}

}
