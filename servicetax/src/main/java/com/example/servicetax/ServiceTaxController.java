package com.example.servicetax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTaxController {
	@Autowired
	ServiceTaxService ts;
	@PostMapping(value="/update")
	public String update(@RequestBody List<ServiceTax>a) {
		return ts.update(a);
	}
	@GetMapping(value="/show")
	public List<ServiceTax> show() {
		return ts.show();
	}
	@GetMapping(value="/showtax/{a}")
	public int showtax(@PathVariable int a) {
		return ts.showtax(a);
	}
	

}
