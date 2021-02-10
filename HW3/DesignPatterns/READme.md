># **_Design Patterns and Spring Boot_**

>## Adding dependencies
First, initialize a Spring starter boot project as usual.
Add the following dependencies:
1. h2
2.	web
3.	jpa
4.	lombok (builder)

![alt](./image/1.png)

Lombok is a handy dependency for giving you the ability to get setters and getters, without getting any boilerplate code.

_**To install lombok in VSCode, add from Extension not by downloading and installing.**_
![alt](./image/2.png)

Then add this dependency into your pom.xml.  
* Search maven repositories for lombok - make sure to use the same version as your lombok.jar. Paste the dependency into the pom.xml
* Similarly, do it for tomcat jasper and jackson dataformat xml 

![alt](./image/3.png)

For more details, check the link given below and follow the readme file till step 2.
https://github.com/YountenTshering/AT70.18_HomeWork/tree/master/Lab1_Finish%20the%20guide

>## Add model:

> Inside src/main/java

1.	Create a 3 package (name such as com.example.DesignPatterns.model)
2.	Inside model package, create a model called User.java with fields of eid, name, and nationality; create setters/getters; and toString

For Creating Setters/getters and toString: Right-Click => source action => generate what we want and select accordinly.

Make sure you mark the class as @Entity so it can work with database, and @Id on top of id to inform the database that it is the primary key

_Remember Model is basically a code representation of your database table/schemas._

> Inside src/main/resources

Create a sql file called data.sql with several insert queries of users.

![alt](./image/4.png)

> Inside application.properties, put the followings:

spring.h2.console.enabled = true 
spring.datasource.platform = h2 
spring.datasource.url = jdbc:h2:mem:mydb

_The above code will allow the program to access a in-memory database called h2._

### Now we are ready to try patterns.



