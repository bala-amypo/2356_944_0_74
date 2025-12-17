package com.example.demo.newentity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constrations.Email;
import jakarta.validation.constrations.NotBlank;

public class NewfileEntity{
    @ID
    @GeneratedValue(stargery=GenerationType.)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message = "no blank allowed")
    @Email(message = "invalid format")
    private String email;
}