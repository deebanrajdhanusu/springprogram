package com.example.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
	@GetMapping(value="/details")
	public Laptop details (@RequestBody Laptop a) {
		return a;
	}

}
