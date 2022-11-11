package com.example.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GSTService {
	@Autowired
	GSTDao gd;

	public String update(List<GST> a) {
		return gd.update(a);
	}

	public int discount(int a) {
		return gd.discount(a);
	}
}
