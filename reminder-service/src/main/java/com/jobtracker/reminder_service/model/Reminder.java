package com.jobtracker.reminder_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String message; // e.g., "Follow up with recruiter"

    private LocalDateTime reminderTime;

    @ManyToOne
    @JoinColumn(name = "application_id", nullable = false)
    private Long applicationId;
}
