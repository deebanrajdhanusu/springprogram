package com.example.laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
	@Autowired
	LaptopService ls;
	@PostMapping(value="/store")
	public String store(@RequestBody List<Laptop>a) {
		return ls.store(a);
	}
	@GetMapping(value="/get")
	public List<Laptop> getAll() {
		return ls.getAll();
	}
	@DeleteMapping(value="/delete")
	public String userDelete() {
		return ls.userDelete();
	}
	@DeleteMapping(value="/deleteid/{a}")
	public String userDeleteById(@PathVariable int a) {
		return ls.userDeleteById(a);
	}

}
