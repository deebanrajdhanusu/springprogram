package com.example.usesoap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class UseProductController {
	@Autowired
	RestTemplate rt;
	@GetMapping(value="/getvalue")
	public List<UseProduct> getValue() {
		String url1="http://localhost:8080/show";
		String url2="http://localhost:8081/recieve/";
		ResponseEntity<List<UseProduct>> response1=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<UseProduct>>(){});
		List<UseProduct> product=response1.getBody();
		product.forEach(x->{
			int hsn=x.getHsn();
			ResponseEntity<Integer> response2=rt.exchange(url2+hsn, HttpMethod.GET,null,Integer.class);
			int discount=response2.getBody();
			x.setPrice(x.getPrice()-x.getPrice()*discount/100);
			});
		return product;
	}

}
