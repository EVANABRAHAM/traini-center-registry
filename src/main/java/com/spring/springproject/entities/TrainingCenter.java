package com.spring.springproject.entities;


import java.time.Instant;
import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;


@Data
@Entity
@Table(name = "training_center")
public class TrainingCenter {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Center name is mandatory")
    @Size(max = 40, message = "Center name should be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center code is mandatory")
    @Size(min = 12, max = 12, message = "Center code must be exactly 12 characters")
    private String centerCode;

    @Embedded
    private Address address;

    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    @Column(nullable = false, updatable = false)
    private Long createdOn;
    
    @Email(message = "Email should be valid")
    private String contactEmail;

    @NotBlank(message = "Contact phone is mandatory")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String contactPhone;

    @PrePersist
    public void onCreate() {
        this.createdOn = Instant.now().getEpochSecond();
    }
}
