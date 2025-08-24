# Spring Boot Security with Thymeleaf

This project demonstrates **Spring Boot + Spring Security + Thymeleaf** with role-based access control, custom login, and REST APIs.

---

## Features

- Custom Thymeleaf login page (`/login`)
- Role-based access:
  - `/home` → Public
  - `/user/**` → User only
  - `/admin/**` → Admin + User
- Custom error pages (`403.html`, `404.html`)
- Users stored in MySQL with **BCrypt** encrypted passwords
- API for signup (via Postman) + UI with Thymeleaf

---

## Tech Stack

- Java 17+
- Spring Boot 3+
- Spring Security
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

---

## Project Structure

src/main/java/com/example/SpringSecurityy/
├── model/ AppUser.java
├── repository/ UserRepository.java
├── service/ CustomUserDetailsService.java
├── Controller/ Controller.java, LoginController.java, UserController.java, ErrorController.java
├── SecurityConfig.java
└── SpringSecurityyApplication.java

src/main/resources/templates/
├── login.html
├── home.html
├── user_home.html
├── admin_home.html
└── error/
├── 403.html
└── 404.html

src/main/resources/application.properties

---

## Database Configuration (`application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/securitydb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.thymeleaf.cache=false
API Endpoints
Method	Endpoint	Description
GET	/home	Public Home (Thymeleaf)
| Method | Endpoint         | Description                       |
| ------ | ---------------- | --------------------------------- |
| GET    | `/home`          | Public Home (Thymeleaf)           |
| POST   | `/api/users/add` | Add new user (signup via Postman) |
| GET    | `/user/home`     | User dashboard                    |
| GET    | `/admin/home`    | Admin dashboard                   |
| GET    | `/403`           | Forbidden page                    |
| GET    | `/404`           | Not Found page                    |

Create User with Postman

POST http://localhost:8080/api/users/add
{
  "username": "john",
  "password": "12345",
  "roles": "USER"
}

Run the App
mvn spring-boot:run
Thymeleaf Pages

login.html – Login form

home.html – Public home

user_home.html – User dashboard

admin_home.html – Admin dashboard

error/403.html – Access Denied

error/404.html – Not Found

## demo Screen Short

![image Alt](https://github.com/mozammilanwar/springboot-role-based-auth/blob/39c7706c7895edd40f749e5ff393689ec8daf4df/registrationpage.png)

👨‍💻 Author: Mozammil Anwar
📞 Contact: 8409546231

