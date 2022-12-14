package com.example.tutorial.model;

import java.util.Date;
import java.util.Objects;

public class TodoModel {

    private int id;
    private String title;
    private String description;
    private UserModel user;
    private Date targetDate;
    private boolean isDone;

    public TodoModel(int id, String title, String description, UserModel user, Date targetDate, boolean isDone) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user = user;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoModel todoModel = (TodoModel) o;
        return id == todoModel.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
