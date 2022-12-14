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

    @GetMapping("/users/{username}/todos")
    public List<TodoModel> getAllTodos(@PathVariable String username) {
        return todoDatabase.getTodos();
    }

    //    Delete Request
    @DeleteMapping("/users/{username}/todos/{id}")
    public int deleteTodo(@PathVariable String username, @PathVariable int id) {
//        TODO if request successful, return 0 else return -1.
        if (true) {
            return 0;
        } else {
            return -1;
        }
    }
}
