package com.jobtracker.application_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "applications")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // Reference to User (from User Service). Example: 101
    @NotNull
    @Column(updatable = false)
    private UUID userId;

    // Example: "Backend Engineer"
    @NotNull
    private String jobTitle;

    // Example: "Acme Corp"
    @NotNull
    private String company;

    // Example: "Bengaluru" or "Remote"
    @NotNull
    private String location;

    // Example: "LinkedIn", "Naukri", "Referral"
    private String source;

    // Example: 2025-08-01 (date of application)
    @NotNull
    private LocalDate applicationDate;

    // Example: "APPLIED", "INTERVIEW", "OFFER", "REJECTED"
    @NotNull
    private String status;

    // Example: "Applied via referral from John Doe"
    private String notes;


    // Extended fields

    // Example: "https://www.linkedin.com/jobs/view/123456"
    private String jobUrl;

    // Example: "Sarah Johnson"
    private String recruiterName;

    // Example: "sarah.johnson@acme.com"
    private String recruiterEmail;

    // Example: "+91-9876543210"
    private String recruiterPhone;

    // Example: "10-12 LPA" or "$80k - $100k"
    private String salaryRange;

    // Example: 1 (completed 1 interview round)
    private Integer interviewRounds;

    // Example: 3 (expected total interview rounds)
    private Integer totalRounds;

    // Example: 2025-09-06T09:00:00Z (auto set when created)
    @NotNull
    @Column(updatable = false)
    private Instant createdAt = Instant.now();

    // Example: 2025-09-06T09:00:00Z (last updated timestamp)
    private Instant updatedAt = Instant.now();
}
