package com.sodikjon.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Main application entry point
 * This annotation tells Spring boot this is the starting class
 */
@SpringBootApplication
public class TaskManagerApplication {
    /**
     * Main method -- java execution starts here
     * Spring Boot's run() method starts the embedded server and initializes the application context
     */
    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }
}
