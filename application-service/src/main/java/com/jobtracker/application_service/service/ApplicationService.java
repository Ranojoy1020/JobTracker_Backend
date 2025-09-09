package com.jobtracker.application_service.service;

import com.jobtracker.application_service.model.Application;
import com.jobtracker.application_service.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository){
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getAllApplications(){
        return applicationRepository.findAll();
    }

    public Application newApplication(Application newApplication){
        newApplication.setCreatedAt(Instant.now());
        return applicationRepository.save(newApplication);
    }
}
