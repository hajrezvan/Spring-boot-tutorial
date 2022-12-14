package com.example.tutorial.view;

import com.example.tutorial.model.TodoModel;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoView {
    public List<TodoModel> getAllTodoModels(String username) {
//      TODO implement this method.
        return new ArrayList<>();
    }
}
