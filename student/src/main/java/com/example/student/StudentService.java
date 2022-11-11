package com.example.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;

	public String show(Student a) {
		return sd.show(a);
	}

	public String showw(List<Student> a) {
		return sd.showw(a);
	}

	public List<Student> shows() {
		return sd.shows();
	}

	public Optional<Student> showss(int a) {
		return sd.showss(a);
	}

	public List<Student> getByDepartment(String a) {
		return sd.getByDepartment(a);
	}

}
