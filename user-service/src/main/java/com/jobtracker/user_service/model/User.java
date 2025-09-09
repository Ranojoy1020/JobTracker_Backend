package com.jobtracker.user_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    @Column(length = 30, nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false, unique = true, length = 50)
    @Email
    private String email;

    @NotNull
    @Column(nullable = false, length = 255)
    private String password;

    @NotNull
    @Column(nullable = false, updatable = false)
    private Instant createdAt;

}
