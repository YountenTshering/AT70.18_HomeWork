># **Software Architecture Design - 2021**

```
Name: Younten Tshering
Student ID: 121775
```

>## **Key Concept learned**:

No single architecture is best! Quality attribute will define it and we should accept the drawback and prioritize the quality.

All **patterns** that I learned, strive for separation of concerns and removing dependencies because reducing software complexity mean higher chance to make changes and add features which is economic value at the end.

Therefore, software architecture increases reusability, save time and money in future perspective.

>### **Concurrency**:

Concurrency is problematic because it is difficult to test. Everything depends on the relative order of events within different threads or processes.

In many cases, we do not have to worry about concurrency, because our RDBMS gives us transactions. However, we need to worry about ***offline concurrency*** (*concurrency control for data manipulated over multiple transactions*).

> The two methods for overcoming concurrency problems are isolation and immutability:

**Isolation** allows a process to enter an isolated zone in which concurrency is not a problem. Conceptually, we work in a memory address space separate from all other processes, and lock all external resources.

**Immutability** means recognizing data that cannot be modified. All concurrency problems involve updates, and immutable data cannot be updated, so immutability eliminates concurrency problems.

> When we have data that we cannot isolate, we use either do optimistic or pessimistic concurrency control.

**Optimistic locking** is when we allow reads and writes and only generate an exception when we see a conflict.
**Pessimistic locking** means once a resource is read, nobody else can edit it until the transaction is finished.

> Optimistic locking means conflict detection; pessimistic locking means conflict prevention.

>## **Final-Exam Submission** 

For the exam, I have tried to **increase cohesion** (by separating based on responsibilities) and **reduce coupling** (by using design patterns and refactoring)

>## Added dependencies:

1. **Spring Web** - provides controllers and MVC support (making web interface)
2. **H2** → dependency for generating in-memory database for quick testing.
3. **Spring JPA** → dependency for supporting many common calls to database without writing a bunch of SQL queries (Object Relational Mapping (**ORM**) mapping tool)
4. **Lombok (builder)** → ability to get setters and getters, without getting any boilerplate code
5. **Java Mail Sender** → simple api for sending email 
6. **Spring Security** → provides built-in authentication/authorization
7. **Rest Repositories** → provides automatic restful ontrollers
8. **Validation** → provides table validation such as @Email
9. **Spring Session** → provides session support

>### Aside from these dependencies, I installed these additional dependencies from maven repositories:

- **Tomcat jasper** → allows us to work with .jsp files.
- **Jackson dataformat xml** → allows our RESTful API to work with XML, instead of only json files
- **JSTL** → a jsp tagging library for looping and conditional logic
- **Money-api and moneta** → for working with currency file


> **Questions Answered:** 

Extra work: Spring Security with admin user and Company since I was interested to do it.
Credentials used in exam, every password is "**1234**"

- Have touched every questions.
- Model(Product, Company and Category) created with relationships.
- Created a simple buy page.
- Till here it was perfect but many changes and implementation was done where I had to go with assumption becuase it was taking time to debug.
- Pessimistic and optimistic locking tried with read and write lock and version in **PurchaseServiceImpl** but gave error and had less time slove and do it. 
- Unit test demonstrated by Junit test concept used in singleton.(Did not finished- give some Assertions error false and project gave error with compilation )
- Finally the locking and testing concept were applied from lab and project work.

> Method applied to do the exam:

1. Start with model,
2. dao or repo,
3. services, 
4. localconverter, 
5. controller and view,
6. Refactored the code.

----------------------------------------------Thank You for everything----------------------------------------------------------------