package com.research.user.dto;

public record AuthResponse(
        String accessToken,
        UserResponse user
) {
}
