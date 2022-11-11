package com.example.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;

	public String show(Student a) {
		sr.save(a);
		return "updated successfully";
	}

	public String showw(List<Student> a) {
		sr.saveAll(a);
		return "updated sucessfully all data";
	}

	public List<Student> shows() {
		return sr.findAll();
	}

	public Optional<Student> showss(int a) {
		return sr.findById(a);
	}

	public List<Student> getByDepartment(String a) {
		return sr.getByDepartment(a);
	}

}
