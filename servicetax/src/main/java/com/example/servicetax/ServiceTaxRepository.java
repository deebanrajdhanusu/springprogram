package com.example.servicetax;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServiceTaxRepository extends JpaRepository<ServiceTax, Integer> {
	@Query(value="select tax from service_tax where hsn =?",nativeQuery=true )
	 public int findbyhsn(int a);

}
