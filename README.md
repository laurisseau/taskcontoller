# Task Controller

This project is a Spring Boot-based TaskController that provides a simple API for managing tasks. It allows you to create, retrieve, and update tasks, including setting their titles, descriptions, and completion status. The project is designed to serve as a basic example of building a RESTful API with Spring Boot.

## Installation

To get started with this project, follow these installation steps:

1. **Clone the Repository**

   First, you need to clone this GitHub repository to your local machine. Open your terminal and run the following command:

   git clone https://github.com/laurisseau/taskcontroller.git

2. **build the project**

   Change your current directory to the project folder:

   cd [github-repo]

   Next, build the project using Gradle. Run the following command:

   ./gradlew build

3. **Run the Application**

   You can run the Spring Boot application using the following Gradle command:

   ./gradlew bootRun

4. **Access the Application**

   Open a web browser or use a tool like Postman to access the API endpoints provided by the TaskController.
   By default, the application should be available at http://localhost:8080. You can use this base URL to make requests to the API.

## Usage

   To use this TaskController, follow the API endpoints described below:

**Create a Task**

   To create a new task, make a POST request to the /tasks endpoint with a JSON object representing the task. 
   The task should include at least a "title" and "description".The completed boolean is
   set to false when a task is created.

**Get All Tasks**
   
   To retrieve a list of all tasks, make a GET request to the /tasks endpoint.

**Get a Task by ID**

   To retrieve a specific task by its ID, make a GET request to the /tasks/{id} endpoint, 
   where {id} is the task's ID. 
   
**Update a Task**

   To update an existing task, make a PUT request to the /tasks/{id} endpoint, 
   where {id} is the task's ID. Provide a JSON object with the fields you want to update, 
   such as "title," "description," and "completed". if the "title" or "description" is left
   empty it will return what it was saved as last.


