package kg.easy.exsqltasks.controllers;

import kg.easy.exsqltasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/execute/{taskNum}")
    public Object executeTask(@PathVariable String taskNum) {
        return taskService.execute(taskNum);
    }

}
