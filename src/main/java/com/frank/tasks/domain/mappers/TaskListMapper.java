package com.frank.tasks.domain.mappers;

import com.frank.tasks.domain.dto.TaskListDto;
import com.frank.tasks.domain.entitites.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto dto);
    TaskListDto toDto(TaskList taskList);
}
