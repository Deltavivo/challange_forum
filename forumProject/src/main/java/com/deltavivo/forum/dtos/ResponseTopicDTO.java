package com.deltavivo.forum.dtos;

import java.time.LocalDateTime;

public record ResponseTopicDTO(
    Long id,
    String title,
    String message,
    LocalDateTime creationDateTime
) {
}
