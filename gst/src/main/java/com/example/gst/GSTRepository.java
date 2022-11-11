package com.example.gst;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GSTRepository extends JpaRepository<GST,Integer> {
	@Query(value="select discount from product_gst where hsn = ?",nativeQuery = true)
	public int finddiscount(int a);

}
