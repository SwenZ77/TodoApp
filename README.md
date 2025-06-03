Todo Application with Spring Boot & Spring Security

Overview

This project is a simple Todo web application built using Spring Boot and Spring Security. It allows users to perform CRUD operations on todo tasks and includes basic user authentication (login/logout). The application follows a RESTful architecture and can be easily integrated with a frontend framework like React or Angular.
Features
- User login and logout using Spring Security
- Session-based authentication
- CRUD operations on todos
- RESTful API endpoints
- Easily extendable for frontend integration
Motivation
This project was developed as a learning exercise to understand the integration of Spring Boot, Spring Security, and REST APIs. It provides a backend foundation for any web application that requires authentication and task management.

Project Structure

src/

├── main/

│   ├── java/com/example/todo/

│   │   ├── controller/

│   │   │   ├── LoginController.java

│   │   │   ├── LogoutController.java

│   │   │   ├── SayHelloController.java

│   │   │   ├── WelcomeController.java

│   │   │   └── TodoController.java

│   │   ├── model/

│   │   │   ├── Todo.java

│   │   │   └── RequestTodo.java

│   │   ├── security/

│   │   │   └── SpringSecurityConfig.java

│   │   ├── service/

│   │   │   └── AuthenticationService.java

│   │   └── MyFirstWebappApplication.java

API Endpoints

Authentication

POST /login - Logs in the user

GET /logout - Logs out the user

Todos

GET /todos - Fetch all todos

POST /todos - Create a new todo

PUT /todos/{id} - Update an existing todo

DELETE /todos/{id} - Delete a specific todo

Tech Stack

- Java 17+

- Spring Boot 3.x

- Spring MVC

- Spring Security

- Maven
  
How to Run
1. Clone the repository:
   git clone https://github.com/SwenZ77/TodoApp.git
2. Navigate to the project directory and run:
   ./mvnw spring-boot:run
3. Open browser at http://localhost:8080/

Default Credentials
Username: user
Password: password
Credentials can be modified in SpringSecurityConfig.java
Future Improvements
- JWT-based token authentication
- Persistent database support (e.g., MySQL/PostgreSQL)
- User registration and role-based access
- Frontend UI using React or Angular
- Docker support
