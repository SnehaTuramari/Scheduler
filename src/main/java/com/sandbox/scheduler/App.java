package com.sandbox.scheduler;

import com.sandbox.scheduler.model.Category;
import com.sandbox.scheduler.model.Task;

import java.util.Arrays;
import java.util.List;

import com.sandbox.scheduler.Scheduler;


public class App {
	
	public static void main(String[] args) {
		Task task1 = new Task(0, Category.RED);
		Task task2 = new Task(0, Category.BLUE);
		Task task3 = new Task(0, Category.GREEN);
		Task task4 = new Task(0, Category.GREEN);
		Task task5 = new Task(0, Category.RED);
		Task task6 = new Task(0, Category.RED);
		
		List<Task> unsorted = Arrays.asList(task1, task2, task3, task4, task5, task6);
		
		
		//Uncoment your line after implementing Scheduler.scheduleTask
		unsorted.forEach(task -> Scheduler.scheduleTask(task));
		
		//Uncoment your line after implementing Scheduler.printSchedule()
		Scheduler.printSchedule();
        
        //To test the example given in the "Schedule Interview Problem.docx"
        //comment above lines of code and uncomment this and run
        /*Task task1 = new Task(0, Category.RED);
		Task task2 = new Task(0, Category.RED);
        
        List<Task> unsorted = Arrays.asList(task1, task2);

        unsorted.forEach(task -> Scheduler.scheduleTask(task));

		System.out.println("BEFORE");
        Scheduler.printSchedule();

        System.out.println("================================");
		
        Task task3 = new Task(0, Category.GREEN);
		Task task4 = new Task(0, Category.GREEN);

		Scheduler.scheduleTask(task3);
		Scheduler.scheduleTask(task4);

		System.out.println("AFTER");
		Scheduler.printSchedule();*/

	}
}
