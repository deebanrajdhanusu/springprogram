package com.example.servicetax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class ServiceTaxDao {
	@Autowired
	ServiceTaxRepository tr;
	public String update(@RequestBody List<ServiceTax>a) {
		 tr.saveAll(a);
		 return "sucess";
	}
	public List<ServiceTax> show() {
		return tr.findAll();
	}
	public int showtax(@PathVariable int a) {
		return tr.findbyhsn(a);
	}
	

}
