package com.example.SpringbootBatch.BatchConfig;

import com.example.SpringbootBatch.Entity.Customer;
import com.example.SpringbootBatch.Repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class BatchConfigurationTest {
    @Mock
    CustomerRepository customerRepository;

    @Mock
    CustomerProcessor customerProcessor;
    @InjectMocks
    BatchConfiguration batchConfiguration;

    @Test
    public void testCsvProcessor(){
        CustomerProcessor result= batchConfiguration.csvProcessor();
        assertNotNull(result);
    }
    @Test
    public void testCsvReader(){
        FlatFileItemReader<Customer> result= batchConfiguration.csvReader();
        assertNotNull(result);
    }
    @Test
    public void testCsvWriter(){
        RepositoryItemWriter<Customer> writer=batchConfiguration.csvwriter();
        assertNotNull(writer);
    }

}