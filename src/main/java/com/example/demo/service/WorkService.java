package com.example.demo.service;

import com.example.demo.domain.models.service.JobServiceModel;

public interface WorkService {

    JobServiceModel saveJob(JobServiceModel jobServiceModel);

    JobServiceModel getGetJobById(String id);
}
