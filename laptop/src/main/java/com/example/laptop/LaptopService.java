package com.example.laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LaptopService {
	@Autowired
	LaptopDao ld;

	public String store(List<Laptop> a) {
		return ld.store(a);
	}

	public List<Laptop> getAll() {
		return ld.getAll();
	}

	public String userDelete() {
		return ld.userDelete();
	}

	public String userDeleteById(int a) {
		return ld.userDeleteById(a);
	}

}
