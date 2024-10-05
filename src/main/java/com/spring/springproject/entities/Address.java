package com.spring.springproject.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Embeddable
@Data
public class Address {
	@NotBlank(message = "Detailed address is mandatory")
    private String detailedAddress;

    @NotBlank(message = "City is mandatory")
    private String city;

    @NotBlank(message = "State is mandatory")
    private String state;

    @Pattern(regexp = "^[1-9][0-9]{5}$", message = "Pincode must be 6 digits")
    private String pincode;
}
