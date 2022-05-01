package com.example.SpringbootBatch.BatchConfig;

import com.example.SpringbootBatch.Entity.Customer;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CustomerProcessorTest {

    @InjectMocks
    CustomerProcessor customerProcessor;

    @Test
    public void process() throws Exception {
        Customer customer=new Customer(1,"first","last");
        Customer resCustomer=customerProcessor.process(customer);
        assertEquals(1,resCustomer.getId());

    }
}