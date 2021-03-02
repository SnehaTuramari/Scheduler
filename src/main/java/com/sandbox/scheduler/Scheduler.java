package com.sandbox.scheduler;

import java.util.Comparator;
import java.util.TreeSet;

import com.sandbox.scheduler.model.Task;

public class Scheduler {

    private static TreeSet<Task> tasks = new TreeSet<>(
            Comparator.comparingInt(Task::getUrgency)
                    .thenComparing(Task::getCategory)
                    .thenComparing(Task::getTimeStamp)
                    .thenComparing(Task::hashCode));

    public static void scheduleTask(Task task){
        tasks.add(task);
    }

    public static void printSchedule(){
        tasks.forEach(task->System.out.println(task.toString()));
    }
}

