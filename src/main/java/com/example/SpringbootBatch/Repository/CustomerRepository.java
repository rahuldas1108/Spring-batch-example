package com.example.SpringbootBatch.Repository;

import com.example.SpringbootBatch.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
