package com.jobtracker.application_service.repository;

import com.jobtracker.application_service.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
