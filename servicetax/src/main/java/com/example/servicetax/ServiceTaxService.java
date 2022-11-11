package com.example.servicetax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ServiceTaxService {
	@Autowired
	ServiceTaxDao td;
	public String update(@RequestBody List<ServiceTax>a) {
		return td.update(a);
	}
	public List<ServiceTax> show() {
		return td.show();
	}
	public int showtax( int a) {
		return td.showtax(a);
	}

}
