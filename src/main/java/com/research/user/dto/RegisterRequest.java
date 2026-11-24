package com.research.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

        @NotBlank @Email
        String email,

        @NotBlank @Size(min = 10, max = 71, message = "Password must be at least 10 characters ")
        String password,

        @NotBlank
        String fullName
) {
}
