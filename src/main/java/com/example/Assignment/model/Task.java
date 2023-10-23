package com.example.Assignment.model;

import java.util.Date;

public class Task {
    private int id;
    private String title;
    private String description;
    private Boolean completed;
    private Date createDate;
    private Date completedDate;

    public Task(int id, String title, String description, Boolean completed,
                Date createDate, Date completedDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.createDate = createDate;
        this.completedDate = completedDate;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
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

    public Boolean getCompleted() {
            return completed;
    }

    public Boolean setCompleted(Boolean completed) {
        this.completed = completed;
        return completed;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date setCreateDate(Date createDate) {
        this.createDate = createDate;
        return createDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }
}
