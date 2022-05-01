package com.example.SpringbootBatch.BatchConfig;

import com.example.SpringbootBatch.Entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        System.out.println("Inserting employee : " + customer);
        return customer;
    }
}
