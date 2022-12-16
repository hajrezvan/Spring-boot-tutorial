package com.example.tutorial.controller;

import com.example.tutorial.database.TodoDatabase;
import com.example.tutorial.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoDatabase todoDatabase;

    public TodoController() {
        todoDatabase = new TodoDatabase();
    }

    public List<TodoModel> getAllTodos(String username) {
        return todoDatabase.getTodos();
    }

    public TodoModel getTodo(String username, int id) {
        return todoDatabase.getTodos(id);
    }

    public boolean deleteTodo(String username, int id) {
        return todoDatabase.deleteTodo(id);
    }

    public boolean updateTodo(TodoModel model, String username, int id) {
        return todoDatabase.saveTodo(model);
    }

    public boolean createTodo(String username) {

    }
}
