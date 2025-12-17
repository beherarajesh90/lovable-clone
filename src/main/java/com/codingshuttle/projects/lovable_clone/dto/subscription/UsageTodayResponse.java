package com.codingshuttle.projects.lovable_clone.dto.subscription;

public record UsageTodayResponse(
        int tokensUsed,
        int tokensLeft,
        int previewRunning,
        int previewLimits
) {
}
