package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.service.CustomerService;

public class CustomerController {

    public Customer handleSignup(Customer customer) {
        System.out.println(" Handing the Customer Data of : " + customer);

        CustomerService customerService = new CustomerService();
       return customerService.handleSignup(customer);

    }
}
