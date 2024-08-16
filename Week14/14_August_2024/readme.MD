# Task Management Application

This repository contains a simple task management application built with Spring Boot, demonstrating RESTful API basics and web development structure using Thymeleaf templates and Bootstrap for the front-end.

## Features

- Create, read, update, and delete tasks
- Responsive design using Bootstrap
- RESTful API architecture
- Thymeleaf templates for server-side rendering
- Data persistence with JPA and H2 in-memory database

## Technologies Used

- **Spring Boot** - Backend framework
- **Spring Data JPA** - Database interactions
- **Thymeleaf** - Template engine
- **Bootstrap** - Front-end framework
- **MySQL** - For database
- **Maven** - Build tool

## Setup

**Clone the repository**

   ```bash
   git clone https://github.com/keerti1924/java-internship-tasks/new/main/Week14/14_August_2024.git
  ```

## Usage
- Navigate to the home page to view all tasks.
- Click "Create New Task" to add a new task.
- Use the "Edit" link to modify an existing task.
- Click "Delete" to remove a task from the list.

## API Endpoints
- GET /tasks - Retrieve all tasks
- GET /tasks/{id} - Retrieve a specific task by ID
- POST /tasks - Create a new task
- POST /tasks/{id} - Update an existing task by ID
- GET /tasks/delete/{id} - Delete a task by ID
