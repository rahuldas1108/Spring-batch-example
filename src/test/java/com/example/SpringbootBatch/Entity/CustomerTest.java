package com.example.SpringbootBatch.Entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CustomerTest {

    @InjectMocks
    Customer customer;

    @Test
    public void testGetId(){
        customer.setId(1);
        int id=customer.getId();
        assertEquals(1,id);

    }
    @Test
    public void testGetFirstName(){
        customer.setFirstName("Rahul");
        assertEquals("Rahul",customer.getFirstName());
    }
    @Test
    public void testGetLirstName(){
        customer.setLastName("Das");
        assertEquals("Das",customer.getLastName());
    }
@Test
    public void TestAllargConstructor(){
        customer= new Customer(1,"a","b");
        assertEquals(1,customer.getId());
    }
}