package com.example.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String store(List<Product> p) {
		pr.saveAll(p);
		
		return "updated sucessfully";
	}

	public List<Product> show() {
		return pr.findAll();
	}

	public List<Product> getBybrand(String a) {
		return pr.getBybrand(a);
	}

	public List<Product> getByrange(int a, int b) {
		return pr.getByrange(a,b);
	}
	public List<Integer> getHsn() {
		return pr.getHSN();
	}

}
