package com.example.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class GSTDao {
	@Autowired
	GSTRepository gr;

	public String update(List<GST> a) {
		gr.saveAll(a);
		return "updated sucessfully" ;
	}

	public int discount(int a) {
		return gr.finddiscount(a);
	}

}
