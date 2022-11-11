package com.example.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GSTController {
	@Autowired
	GSTService gs;
	@PostMapping(value="/update")
	public String update(@RequestBody List<GST>a ) {
		return gs.update(a);
		
	}
	@GetMapping(value="/recieve/{hsn}")
	public int discount(@PathVariable("hsn") int a) {
		return gs.discount(a);
	}

}
