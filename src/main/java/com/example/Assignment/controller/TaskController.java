package com.example.Assignment.controller;
import com.example.Assignment.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    int taskId = 0;
    List<Task> tasks = new ArrayList<>();

    @PostMapping
    public ResponseEntity<String> createTask(@RequestBody Task task) {
        try {

            int id = task.setId(taskId++);

            String title = task.getTitle();
            if(title == null || title.isEmpty()){
                return ResponseEntity.badRequest().body("There needs to be a title.");
            }

            String description = task.getDescription();
            if(description == null || description.isEmpty()){
                return ResponseEntity.badRequest().body("There needs to be a description.");
            }

            Boolean completed = task.setCompleted(false);
            Date createDate = task.setCreateDate(new Date());

            tasks.add(task);

            return ResponseEntity.ok("Task created successfully");

        } catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid request: " + ex.getMessage());
        }
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task updatedTask) {
        for (Task task : tasks) {
            if (task.getId() == id) {

                String title = updatedTask.getTitle();

                if(title == null || title.isEmpty()){
                    title = task.getTitle();
                }

                String description = updatedTask.getDescription();

                if(description == null || description.isEmpty()){
                    description = task.getDescription();
                }

                Boolean completed = updatedTask.getCompleted();

                if(completed) {
                    task.setCompletedDate(new Date());
                }else{
                    task.setCompletedDate(null);
                }

                task.setTitle(title);
                task.setDescription(description);
                task.setCompleted(completed);

                return task;
            }
        }
        return null;
    }

}
