# Employee Management REST API

Simple backend REST API built with Spring Boot for managing employee records.

## Tech Stack
- Java
- Spring Boot
- Spring Web
- Hibernate / JPA
- PostgreSQL
- Maven

## Features
- Create employee records
- Retrieve employee data
- Update employee information
- Delete employees
- RESTful JSON API

## Endpoints
| Method | Endpoint              | Description        |
| ------ | --------------------- | ------------------ |
| POST   | `/api/employees`      | Create employee    |
| GET    | `/api/employees/{id}` | Get employee by ID |
| GET    | `/api/employees`      | Get all employees  |
| PUT    | `/api/employees/{id}` | Update employee    |
| DELETE | `/api/employees/{id}` | Delete employee    |
