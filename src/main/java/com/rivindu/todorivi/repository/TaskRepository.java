package com.rivindu.todorivi.repository;

import com.rivindu.todorivi.dto.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    private static final List<Task> tasks = List.of(new Task("1", "Task 1", "Description 1", false),
            new Task("2", "Task 2", "Description 2", false),
            new Task("3", "Task 3", "Description 3", false));

    public List<Task> fetchAllTasks() {
        return tasks;
    }

    public Task fetchTaskById(String id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElse(null);
    }
}
