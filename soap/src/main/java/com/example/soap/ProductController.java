package com.example.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	@PostMapping(value="/store")
	public String store(@RequestBody List<Product>p) {
		return ps.store(p);
	}
	@GetMapping(value="show")
	public List<Product> show() {
		return ps.show();
	}
	@GetMapping(value="/brand/{a}")
	public List<Product> getBybrand(@PathVariable String a) {
		return ps.getBybrand(a);
	}
	@GetMapping(value="/range/{a}/{b}")
	public List<Product> getByrange(@PathVariable int a,@PathVariable int b) {
		return ps.getByrange(a,b);
	}
	@GetMapping(value="/value")
	public List<Integer> getHsn() {
		return ps.getHsn();
	}

}
