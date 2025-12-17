package com.codingshuttle.projects.lovable_clone.dto.auth;

public record AuthResponse(
        String email,
        String name,
        String password
) {
}
