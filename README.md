# 👨‍💼 Employee Relationship Management System (Spring Boot REST API)

A RESTful Employee Relationship Management System built using Spring Boot and JPA (Hibernate).  
This project manages employees along with their department relationships.

---

## 📁 Project Structure

```
src/
 └── main/
     ├── java/
     │    └── com/cfs/EmployeeRelationship_mngt/
     │         ├── controller/
     │         │     ├── EmployeeController.java
     │         │     └── DepartmentController.java
     │         ├── entity/
     │         │     ├── Employee.java
     │         │     └── Department.java
     │         ├── exceptions/
     │         ├── repository/
     │         │     ├── EmployeeRepo.java
     │         │     └── DepartmentRepo.java
     │         ├── service/
     │         │     ├── EmployeeService.java
     │         │     ├── EmployeeServiceImpl.java
     │         │     ├── DepartmentService.java
     │         │     └── DepartmentServiceImpl.java
     │         └── EmployeeRelationshipMngtApplication.java
     │
     └── resources/
          ├── application.properties
          ├── static/
          └── templates/
```

## 🚀 Features

- Add employee
- Get all employees
- Update employee
- Delete employee
- Add department
- Get all departments
- Employee-Department relationship (Many-to-One / One-to-Many)
- RESTful API design

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2 Database
- Postman (API testing)

---

## 📡 API Endpoints

### 👨‍💼 Employee APIs

Get all employees  
GET /employees  

Get employee by ID  
GET /employees/{id}  

Create employee  
POST /employees  

Update employee  
PUT /employees/{id}  

Delete employee  
DELETE /employees/{id}  

---

### 🏢 Department APIs

Get all departments  
GET /departments  

Create department  
POST /departments  

---

## 📥 Sample JSON (Employee)

{
        "id": 2,
        "name": "Kiran",
        "email": "Kiran@gmail.com",
        "salary": 400000.0,
        "department": {
            "id": 2,
            "name": "HR",
            "location": "Mumbai",
            "hibernateLazyInitializer": {}
    }
 }

---

## 📥 Sample JSON (Department)

{
  "name": "IT",
  "location": "Noida"
}

---

## ⚙️ Application Properties (Example)

spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---

## ▶️ How to Run

1. Clone the repository  
git clone https://github.com/your-username/employee-relationship-management.git  

2. Open project in IDE (IntelliJ / Eclipse)  

3. Run main class  
EmployeeRelationshipMngtApplication.java  

4. Server will start on  
http://localhost:8080  

---

## 🧪 Testing

Use Postman:

GET http://localhost:8080/employees  
GET http://localhost:8080/departments  

---

## 📌 Author

Rushikesh Sahane
