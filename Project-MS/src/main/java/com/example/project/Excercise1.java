package com.example.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Excercise1 {
	@GetMapping(value="/greetings")
	public String name() {
		return ("hello ragav");
	}
	@GetMapping(value="/company/{a}")
	public String companyName(@PathVariable String a) {
		if(a.equalsIgnoreCase("onesoft")) {
			return (a+" is IT company");
		}
		else {
			return (a+"unknown company");
		}
	}
	@GetMapping(value="/number/{a}")
	public String number(@PathVariable int a) {
		if(a%2==0) {
			return (a+" is even number");
		}
		else {
			return (a+" is odd number");
		}
	}
	@GetMapping(value="/match")
	public String checkAuthorization(@RequestParam String a,@RequestParam String b) {
		if(a.equals("raj")&&b.equals("onesoft")) {
			return "Authorised person";
		}
		else {
			return "Unauthorised person";
		}
	}

}
