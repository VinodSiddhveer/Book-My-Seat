package com.BookMySeat.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookMySeat.beans.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
	
	public Customer findByEmailAndPassword(String email, String password);

}
