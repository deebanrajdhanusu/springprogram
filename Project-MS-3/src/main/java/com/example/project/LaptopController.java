package com.example.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LaptopController {
	@GetMapping("/details")
	public Laptop details (@RequestBody Laptop a) {
		return a;
	}
	@GetMapping("/info")
	public ArrayList<Laptop> details1(@RequestBody ArrayList<Laptop>a) {
		return a;
	}

}
