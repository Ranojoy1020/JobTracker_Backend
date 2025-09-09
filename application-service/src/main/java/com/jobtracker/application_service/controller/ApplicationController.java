package com.jobtracker.application_service.controller;

import com.jobtracker.application_service.model.Application;
import com.jobtracker.application_service.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    public final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService){
        this.applicationService = applicationService;
    }

    @GetMapping("/allApplications")
    public ResponseEntity<List<Application>> allApplications(){
        return ResponseEntity.ok(applicationService.getAllApplications());
    }

    @PostMapping("/")
    public ResponseEntity<Application> newApplication(@RequestBody Application application){
        return ResponseEntity.ok(applicationService.newApplication(application));
    }

}
