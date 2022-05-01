package com.example.SpringbootBatch.Controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/batch")
public class BatchController {

    @Autowired
    JobLauncher jobLauncher;
    @Autowired
    Job job;

    @PostMapping("/run")
    public ResponseEntity<String> importcsv2db() {
        JobParameters jobParameters=new JobParametersBuilder().addLong("Start At", System.currentTimeMillis())
                .toJobParameters();
        try {
            jobLauncher.run(job,jobParameters);
            return new ResponseEntity<>("Processed", HttpStatus.OK);
        } catch (JobExecutionAlreadyRunningException | JobRestartException |
                JobInstanceAlreadyCompleteException | JobParametersInvalidException e) {

            e.printStackTrace();
            return new ResponseEntity<>("Processed", HttpStatus.OK);
        }
    }

    @ResponseBody
    @GetMapping("/getRun")
    public String hello() {
        return "Hello Controller";
    }


}
