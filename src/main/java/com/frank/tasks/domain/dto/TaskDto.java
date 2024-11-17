package com.frank.tasks.domain.dto;

import com.frank.tasks.domain.entitites.TaskPriority;
import com.frank.tasks.domain.entitites.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
