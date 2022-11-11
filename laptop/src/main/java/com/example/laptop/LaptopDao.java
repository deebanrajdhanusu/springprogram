package com.example.laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class LaptopDao {
	@Autowired
	LaptopRepository lr;

	public String store(List<Laptop> a) {
		lr.saveAll(a);
		return "saved successfully";
	}

	public List<Laptop> getAll() {
		return lr.findAll();
	}

	public String userDelete() {
		 lr.deleteAll();
		 return "deleted sucessfully";
	}

	public String userDeleteById(int a) {
		lr.deleteById(a);
		return "deleted sucessfully by id";
	}

}
