package com.frank.tasks.domain.mappers;

import com.frank.tasks.domain.dto.TaskDto;
import com.frank.tasks.domain.entitites.Task;

public interface TaskMapper {

    Task fromDto(TaskDto dto);
    TaskDto toDto(Task task);
}
