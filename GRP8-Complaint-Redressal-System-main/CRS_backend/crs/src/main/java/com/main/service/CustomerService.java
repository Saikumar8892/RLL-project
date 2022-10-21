package com.main.service;

import java.util.List;

import com.main.model.Customers;

public interface CustomerService {

	List <Customers> fetchAllCustomers();
	void saveCustomer(Customers customer);
	Customers findCustomerById(String email);
	void deleteCustomer(Customers customer);
	Boolean validateCustomer(String customerEmail, String customerPassword);
}
