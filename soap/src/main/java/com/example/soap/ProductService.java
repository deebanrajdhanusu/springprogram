package com.example.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	@Autowired
	ProductDao pd;
	
	
	public String store(List<Product> p) {
	
		return pd.store(p);
	}


	public List<Product> show() {
		return pd.show();
	}


	public List<Product> getBybrand(String a) {
		return pd.getBybrand(a);
	}


	public List<Product> getByrange(int a, int b) {
		return pd.getByrange(a,b);
	}
	public List<Integer> getHsn() {
		return pd.getHsn();
	}

}
