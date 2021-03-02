package com.sandbox.scheduler.model;

import java.time.LocalDateTime;

public class Task {

    public int urgency = -1;
    public Category category;
    public LocalDateTime timeStamp = LocalDateTime.now();

    public Task(int urgency, Category category) {
        this.urgency = urgency;
        this.category = category;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String toString() {
        return "[TASK] URGENCY: " + urgency + " CATEGORY: " + category + " TIMESTAMP: " + timeStamp;
    }
}
