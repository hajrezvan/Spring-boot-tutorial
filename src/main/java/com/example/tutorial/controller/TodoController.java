package com.example.tutorial.controller;

import com.example.tutorial.database.TodoDatabase;
import com.example.tutorial.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoDatabase todoDatabase;

    public List<TodoModel> getAllTodos(String username) {
        return todoDatabase.getTodos();
    }

    public boolean deleteTodo(String username, int id) {
        return todoDatabase.deleteTodo(id);
    }
}
