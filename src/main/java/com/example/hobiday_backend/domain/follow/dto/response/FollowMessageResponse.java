package com.example.hobiday_backend.domain.follow.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FollowMessageResponse {
    String message;
    boolean isFollowing;
}
