package com.example.soap;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	@Query(value="select * from product_details where brand like?",nativeQuery = true)
	public List<Product> getBybrand(String a);
	@Query(value="select * from product_details where price >? and price <?",nativeQuery = true)
	public List<Product> getByrange(int a, int b);
	@Query(value="select hsn from product_details",nativeQuery=true)
	public List<Integer> getHSN();

}
