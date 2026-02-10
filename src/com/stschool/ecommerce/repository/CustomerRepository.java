package com.stschool.ecommerce.repository;

import com.stschool.ecommerce.model.Customer;

public class CustomerRepository {
    public  Customer addNewCustomer(Customer customer){
        System.out.println("Customer Repository : " + customer);
        return customer;

    }
}
