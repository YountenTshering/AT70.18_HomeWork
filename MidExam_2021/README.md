># Software Architecture Design - 2021

>## Mid-Exam Submission 

For the exam, I have tried to **increase cohesion** (by separating based on responsibilities) and **reduce coupling** (by using design patterns and refactoring)

>## Adding dependencies
Generated project from https://start.spring.io/

1. **Spring Web** - provides controllers and MVC support
2. **H2** → dependency for generating in-memory database for quick testing.
3. **Spring JPA** → dependency for supporting many common calls to database without writing a bunch of SQL queries (Object Relational Mapping (**ORM**) mapping tool)
4. **Lombok (builder)** → ability to get setters and getters, without getting any boilerplate code
5. **Java Mail Sender** → simple api for sending email 
6. **Spring Security** → provides built-in authentication/authorization
7. **Rest Repositories** → provides automatic restful controllers
8. **Validation** → provides table validation such as @Email (Not Used)

>### Aside from these dependencies, make sure to install these additional dependencies from maven repositories:

- **Tomcat jasper** → allows us to work with .jsp files.
- **Jackson dataformat xml** → allows our RESTful API to work with XML, instead of only json files
- **JSTL** → a jsp tagging library for looping, conditional logic
- **Money-api and moneta** → for working with currency file


Questions Answered: 
- Have touched every questions.
- Admin login worked **(Username: Younten, Password is 1234)** 
- Model created with relationships.
- Admin logic to add and edit user/employee.
- Update or date(DOB) logic in admin edit tried with local date converter.
- For calculating salary- only dependencies and helper created to start with.
-------------------------------Thank You-------------------------------------