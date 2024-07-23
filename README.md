# Spring Boot RESTful Web Service

This project demonstrates a simple RESTful web service using Spring Boot, following the tutorial from [Spring.io](https://spring.io/guides/tutorials/rest).

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Testing the API](#testing-the-api)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Introduction
This project showcases a basic RESTful web service for managing employee data, utilizing Spring Boot and Spring Data JPA with an H2 database.

## Features
- CRUD operations for employees
- In-memory H2 database
- RESTful API with Spring HATEOAS for hypermedia-driven output

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Setup
Ensure you have Java 17 and Maven installed.

1. Clone the repository:
   ```bash
   git clone https://github.com/JanZemlicka7801/REST_API_tutorial.git
   cd restful-web-service
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

## Running the Application
Start the application with:
```bash
mvn spring-boot:run
```

Access the application at `http://localhost:8080`.

## Testing the API
Use tools like Postman or curl to interact with the API endpoints:
- `GET /employees` - Retrieve all employees
- `GET /employees/{id}` - Retrieve a specific employee
- `POST /employees` - Create a new employee
- `PUT /employees/{id}` - Update an employee
- `DELETE /employees/{id}` - Delete an employee

### Example curl Requests
- Retrieve all employees:
  ```bash
  curl -X GET http://localhost:8080/employees
  ```

- Create a new employee:
  ```bash
  curl -X POST -H "Content-Type: application/json" -d '{"name": "John Doe", "role": "Developer"}' http://localhost:8080/employees
  ```

## Project Structure
```
src
├── main
│   ├── java
│   │   └── payroll
│   │       ├── Employee.java
│   │       ├── EmployeeRepository.java
│   │       ├── EmployeeController.java
│   │       ├── EmployeeNotFoundException.java
│   │       ├── EmployeeNotFoundAdvice.java
│   │       └── PayrollApplication.java
│   └── resources
│       └── application.properties
└── test
    └── java
        └── payroll
            └── PayrollApplicationTests.java
```

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

**points for me - last saved spot is topic of [Spring HATEOAS]
