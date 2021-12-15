package com.example.demo.service;


import com.example.demo.domain.entities.Job;
import com.example.demo.domain.models.service.JobServiceModel;
import com.example.demo.repository.JobRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

@Service
public class WorkServiceImpl implements WorkService {

   private final ModelMapper modelMapper;
   private final JobRepository jobRepository;

   @Autowired
   public WorkServiceImpl(ModelMapper modelMapper, JobRepository jobRepository) {
      this.modelMapper = modelMapper;
      this.jobRepository = jobRepository;
   }

   @Override
   public JobServiceModel saveJob(JobServiceModel jobServiceModel) {
      Job job= this.modelMapper.map(jobServiceModel, Job.class);
//job.setToday(LocalDate.now());
      System.out.println(job);
      return this.modelMapper.map(this.jobRepository.saveAndFlush(job), JobServiceModel.class);
   }


   @Override
    public  JobServiceModel getGetJobById(String id) {
     Job job= this.jobRepository.findById(id).get();
      return  this.modelMapper.map(job, JobServiceModel.class);
    }

}
