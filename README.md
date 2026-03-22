# Task-Management-System-Spring-Boot-
A full-stack Todo / Task Management web application built using Spring Boot following MVC architecture.  The application allows users to manage daily tasks with features like adding, updating, deleting, and viewing todos. It demonstrates core backend concepts including request handling, layered architecture, validation, and database integration.

# Features:
• User login functionality (basic authentication)
• Add, update, delete, and view tasks (CRUD operations)
• Form validation using Spring Boot Starter Validation
• Session management for user-specific data
• JSP-based UI with JSTL for dynamic rendering
• Integration with H2 (in-memory) and MySQL database

# Tech Stack:
Backend: Spring Boot, Spring MVC  
Frontend: JSP, JSTL, Bootstrap (WebJars)  
Database: H2 (for development), MySQL (via Docker)  
ORM: Spring Data JPA, Hibernate  
Build Tool: Maven  

# Key Concepts Demonstrated:
• Spring Boot project structure and auto-configuration
• Request flow (DispatcherServlet → Controller → View)
• MVC architecture (Controller-Service-Repository)
• Form handling with @RequestParam and Model
• Validation using @Valid and BindingResult
• Session handling using @SessionAttributes / HttpSession
• Database interaction using JPA and JpaRepository

# How to Run:
1. Clone the repository
2. Start MySQL using Docker:

docker run --detach \
--env MYSQL_ROOT_PASSWORD=dummypassword \
--env MYSQL_USER=todos-user \
--env MYSQL_PASSWORD=dummytodos \
--env MYSQL_DATABASE=todos \
--name mysql \
--publish 3306:3306 \
mysql:8-oracle

3. Update application.properties if needed
4. Run the Spring Boot application
5. Open browser: http://localhost:8081


