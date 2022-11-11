package com.example.uselaptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UseLaptopController {
	@Autowired
	RestTemplate rt;
	@GetMapping(value="/laptop")
	public List<UseLaptop> laptop() {
		String url1="http://localhost:8080/get";						
																//null-no header file name
		String url2="http://localhost:8081/showtax/";
		ResponseEntity<List<UseLaptop>> response1=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<UseLaptop>>(){});
		List<UseLaptop> laptops=response1.getBody();
		laptops.forEach(x->{
			int hsn=x.getHsn();
			ResponseEntity<Integer> response2=rt.exchange(url2+hsn,HttpMethod.GET,null,Integer.class);
			int tax=response2.getBody();
			x.setPrice(x.getPrice()+x.getPrice()*tax/100);
			
		});
		return laptops;
		

	}
	

}
