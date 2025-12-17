package com.codingshuttle.projects.lovable_clone.dto.auth;

public record SignupRequest(
        String token,
        UserProfileResponse user
) {
}
