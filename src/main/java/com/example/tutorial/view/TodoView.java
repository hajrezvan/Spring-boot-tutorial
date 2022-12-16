package com.example.tutorial.view;

import com.example.tutorial.controller.TodoController;
import com.example.tutorial.model.TodoModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class TodoView {
    private final TodoController todoController;

    public TodoView() {
        todoController = new TodoController();
    }

    @GetMapping("/users/{username}/todos")
    public List<TodoModel> getAllTodos(@PathVariable String username) {
        return todoController.getAllTodos(username);
    }

    @GetMapping("/users/{username}/todos/{id}")
    public TodoModel getTodo(@PathVariable String username, @PathVariable int id) {
        return todoController.getTodo(username, id);
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable int id) {
        if (todoController.deleteTodo(username, id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/users/{username}/todos/{id}")
    public ResponseEntity<TodoModel> updateTodo(@PathVariable String username, @PathVariable int id, @RequestBody TodoModel todo) {
        if (todoController.updateTodo(todo, username, id)) {
            return new ResponseEntity<>(todo, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/users/{username}/todos")
    public ResponseEntity<Void> createTodo(@PathVariable String username, @RequestBody TodoModel todo) {
        if (todoController.createTodo(username)) {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(todo.getId()).toUri();
            return ResponseEntity.created(uri).build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
