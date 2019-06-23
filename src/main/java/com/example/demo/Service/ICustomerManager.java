package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Customer;

import antlr.collections.List;

@Service
public interface ICustomerManager  {
	
public Customer create(Customer customer);
public Customer updateCustomer(Customer customer);
public Customer getCustomer(int Customerid); 
public boolean checkCustomer(int studentId); 
public List getAllCustomer();
public String deleteCustomer(int studentId);
public List getCustomerByName(String customerName);
Customer updateCustomer(Customer customer); 

}

