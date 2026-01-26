# Spring Boot JPA CRUD API

A RESTful web service built with **Spring Boot**, **JPA / Hibernate**, and **Maven**, designed to demonstrate clean architecture, domain modeling, CRUD operations, and exception handling using best practices.

This project was developed as part of a Spring Boot course and serves as a **portfolio-ready backend application**.

---

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- H2 Database (test environment)
- Apache Tomcat (embedded)
- Postman (API testing)

---

## 📐 Domain Model

The application models a simple **e-commerce system**, with the following main entities:

- **User**
- **Order**
- **Product**
- **Category**
- **OrderItem**
- **Payment**
- **OrderStatus (enum)**

Key relationships:
- One-to-many (User → Orders)
- Many-to-many (Product ↔ Category)
- Many-to-many with extra attributes (Order ↔ Product via OrderItem)
- One-to-one (Order ↔ Payment)

The domain was carefully designed using JPA annotations and follows good object-oriented principles.

---

## 🧱 Project Architecture

The project follows a **layered architecture**, separating responsibilities clearly:

### Logical Layers

Resource Layer (REST Controllers)\
↓\
Service Layer (Business Logic)\
↓\
Repository Layer (Data Access - JPA)\
↓\
Database

### Layers Description

- **Entities**  
  Domain model mapped with JPA annotations.

- **Repositories**  
  Interfaces extending `JpaRepository` to handle database operations.

- **Services**  
  Contains business logic and orchestrates repository access.

- **Resources (Controllers)**  
  REST controllers responsible for handling HTTP requests and responses.

- **Exception Handling**  
  Centralized error handling using `@ControllerAdvice`.

---

## 🌐 REST API Overview

### Example Endpoints

| Method | Endpoint       | Description           |
|------|---------------|-----------------------|
| GET  | /users        | List all users        |
| GET  | /users/{id}   | Get user by ID        |
| POST | /users        | Create a new user     |
| PUT  | /users/{id}   | Update a user         |
| DELETE | /users/{id} | Delete a user         |

All endpoints return proper HTTP status codes and JSON responses.

---

## 🗄️ Database Configuration

### Test Profile (H2)

The application uses an **H2 in-memory database** for testing and development.

- Profile: `test`
- H2 Console enabled at `/h2-console`
- Database is automatically populated using a **CommandLineRunner**

### Production

The project is ready to be configured with **PostgreSQL** for production environments.

---

## 🌱 Database Seeding

When running with the `test` profile, the database is automatically populated with sample data, including:

- Users
- Categories
- Products
- Orders
- Order items
- Payments

This allows immediate testing of the API without manual inserts.

---

## ⚠️ Exception Handling

The API includes a robust exception handling strategy:

- `ResourceNotFoundException` → 404 Not Found
- `DatabaseException` → 400 Bad Request
- Standardized error response structure
- Centralized handling using `@ControllerAdvice`

---

## ▶️ How to Run the Project

### Prerequisites

- Java installed
- Maven installed
- IDE (IntelliJ IDEA recommended)

### Steps

```bash
# Clone the repository
git clone https://github.com/your-username/springboot-jpa-crud-api.git

# Navigate to the project folder
cd springboot-jpa-crud-api

# Run the application
./mvnw spring-boot:run

# The application will start on:
http://localhost:8080
```

## 🧪 Testing the API

You can test the endpoints using Postman, Insomnia, or any HTTP client.

Example JSON for creating a user:

```json
{
"name": "Bob Brown",
"email": "bob@gmail.com",
"phone": "977557755",
"password": "123456"
}
```

## 📌 Learning Outcomes

This project demonstrates:

- RESTful API design
- Spring Boot configuration
- JPA /Hibernate mappings
- Clean layered architecture
- Dependency Injection
- Exception handling
- Database seeding
- CRUD operations
- Good backend development practices

## 👩‍💻 Author

Carla
Backend Developer (Java / Spring Boot)

⭐ If you found this project useful, feel free to star the repository!