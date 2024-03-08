package com.rivindu.todorivi.controller;
import com.rivindu.todorivi.dto.CommonResponse;
import com.rivindu.todorivi.dto.Task;
import com.rivindu.todorivi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class ToDoController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    public CommonResponse<List<Task>> getTasks() {
        return taskService.getTasks();
    }

    @GetMapping("/{id}")
    public CommonResponse<Task> getTaskById(@PathVariable String id) {
        return taskService.getTaskById(id);
    }
}
