package com.example.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	@Query(value="select * from student_details where department like?",nativeQuery = true)
	public List<Student> getByDepartment(String a); 
	

}
