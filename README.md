# Employee Management System

A full-stack Employee Management System built with **Angular** and **Spring Boot**. The application provides employee management through RESTful APIs, user registration and login, password encryption, and MySQL database integration.

## 🚀 Features

* User registration
* User login
* BCrypt password hashing
* Employee management

  * Create employee
  * View all employees
  * View employee by ID
  * Update employee
  * Delete employee
* RESTful APIs
* MySQL database integration
* Spring Data JPA / Hibernate
* API testing with Postman
* CORS configuration for Angular and Spring Boot

> **Note:** JWT-based authentication and protected API endpoints are currently being implemented.

## 🛠️ Technologies Used

### Frontend

* Angular
* TypeScript
* HTML5
* CSS3

### Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* RESTful APIs
* BCrypt

### Database

* MySQL

### Tools

* IntelliJ IDEA
* Visual Studio Code
* Postman
* Git / GitHub

## 🏗️ Project Architecture

```text
Angular Frontend
       │
       │ HTTP Requests
       ▼
Spring Boot REST API
       │
       ▼
Service Layer
       │
       ▼
Repository Layer
       │
       ▼
MySQL Database
```

### Backend Structure

```text
src/main/java
└── net.javaguides.springboot
    ├── config
    ├── controller
    ├── dto
    ├── exception
    ├── model
    ├── repository
    ├── security
    └── service
```

### Frontend Structure

```text
src/app
├── components
├── services
├── models
└── ...
```

## 🔐 Authentication

The application uses **Spring Security** and **BCrypt password hashing** for user authentication.

During registration:

```text
User Password
      ↓
BCrypt Password Encoder
      ↓
Hashed Password
      ↓
MySQL Database
```

During login:

```text
Email + Password
      ↓
Find User
      ↓
BCrypt Password Verification
      ↓
Successful Login
```

JWT authentication will be used to secure protected API endpoints.

## 🔗 REST API Endpoints

### Authentication

| Method | Endpoint                | Description         |
| ------ | ----------------------- | ------------------- |
| POST   | `/api/v1/auth/register` | Register a new user |
| POST   | `/api/v1/auth/login`    | Login user          |

### Employees

| Method | Endpoint                 | Description        |
| ------ | ------------------------ | ------------------ |
| GET    | `/api/v1/employees`      | Get all employees  |
| GET    | `/api/v1/employees/{id}` | Get employee by ID |
| POST   | `/api/v1/employees`      | Create employee    |
| PUT    | `/api/v1/employees/{id}` | Update employee    |
| DELETE | `/api/v1/employees/{id}` | Delete employee    |

## 📋 Example Employee Request

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "emailId": "john@gmail.com"
}
```

## 📋 Example Registration Request

```json
{
  "email": "john@gmail.com",
  "password": "123456"
}
```

## ⚙️ Setup and Installation

### Prerequisites

Make sure you have installed:

* Java JDK
* Maven
* Node.js
* Angular CLI
* MySQL
* Git

### 1. Clone the Repository

```bash
git clone <your-github-repository-url>
```

### 2. Configure MySQL

Create a database:

```sql
CREATE DATABASE employee_management_system;
```

Update the database configuration in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management_system?useSSL=false
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Spring Boot Backend

From the backend project directory:

```bash
mvn spring-boot:run
```

The backend will run on:

```text
http://localhost:8080
```

### 4. Run the Angular Frontend

Navigate to the Angular project:

```bash
cd frontend
```

Install dependencies:

```bash
npm install
```

Start the Angular application:

```bash
ng serve
```

The frontend will run on:

```text
http://localhost:4200
```

## 🧪 API Testing

The REST APIs can be tested using **Postman**.

Example:

```text
POST http://localhost:8080/api/v1/auth/register
```

```text
POST http://localhost:8080/api/v1/auth/login
```

Employee endpoints can also be tested through Postman before integrating them with the Angular frontend.

## 📌 Project Status

* [x] Employee CRUD APIs
* [x] User registration
* [x] BCrypt password hashing
* [x] User login
* [x] Duplicate email prevention
* [x] Angular frontend
* [ ] JWT authentication
* [ ] JWT-protected employee APIs
* [ ] Angular JWT interceptor
* [ ] Role-based authorization

## 👩‍💻 Author

**Shahida Ibrahim**

Software Engineer | Angular | Spring Boot 



