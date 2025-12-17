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
    public NewfileEntity(Long id, @NotBlank(message = "should not contain spaces")String name,
            @NotBlank(message = "no blank allowed") @Email(message = "invalid format")String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}