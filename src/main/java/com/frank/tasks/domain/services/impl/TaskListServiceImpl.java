package com.frank.tasks.domain.services.impl;

import com.frank.tasks.domain.entitites.TaskList;
import com.frank.tasks.domain.reposetories.TaskListRepository;
import com.frank.tasks.domain.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
