package com.example.tutorial.database;

import com.example.tutorial.model.TodoModel;
import com.example.tutorial.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoDatabase {
    private static final List<TodoModel> todos = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
        todos.add(new TodoModel(++idCounter, "title", "description", new UserModel(), new Date(), false));
    }

    public List<TodoModel> getTodos() {
        return todos;
    }

    public boolean deleteTodo(int id) {
        TodoModel todoModel = findById(id);
        if (todoModel == null) return false;
        return todos.remove(todoModel);
    }

    private TodoModel findById(int id) {
        for (TodoModel todo :
                todos) {
            if (todo.getId() == id) return todo;
        }
        return null;
    }
}
