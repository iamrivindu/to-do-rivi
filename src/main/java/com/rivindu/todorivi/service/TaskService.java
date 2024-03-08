package com.rivindu.todorivi.service;

import com.rivindu.todorivi.dto.CommonResponse;
import com.rivindu.todorivi.dto.Task;
import com.rivindu.todorivi.repository.TaskRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Log4j2
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public CommonResponse<List<Task>> getTasks() {
        CommonResponse<List<Task>> commonResponse = new CommonResponse<>();
        try {
            List<Task> tasks = taskRepository.fetchAllTasks();
            commonResponse.setData(tasks);
            commonResponse.setStatus("SUCCESS");
        } catch (Exception e) {
            log.error("Error while fetching tasks", e);
            commonResponse.setStatus("FAILURE");
        }
        return commonResponse;
    }

    public CommonResponse<Task> getTaskById(String id) {
        CommonResponse<Task> commonResponse = new CommonResponse<>();
        try {
            Task task = taskRepository.fetchTaskById(id);
            commonResponse.setData(task);
            commonResponse.setStatus("SUCCESS");
        } catch (Exception e) {
            log.error("Error while fetching tasks", e);
            commonResponse.setStatus("FAILURE");
        }
        return commonResponse;
    }

}
