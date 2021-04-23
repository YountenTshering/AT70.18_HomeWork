># Assignment

Instead of using JDBC as the session store, lack of relational information in session, it is often faster and more effective to use other database frameworks such as Redis which is plain and straightforward. Thus, in this we will connect our application to a Redis and store the session.

># Follow the HW7 for setting up the index and controllor for the spring project.

># Redis as a Session Store

Using Spring Session Redis, follow the following steps:

1. Create a application in repository as HW7

2. Dependencies in pom.xml
Replace the jdbc dependencies with these two dependencies:

![alt](./image/1.PNG)

1. Change in application.properties

![alt](./image/2.PNG)

Or we can install Redis docker container.

># Run as a Spring Boot app, and start adding some messages. 

### Should notice the download being started for first run:

![alt](./image/3.PNG)

Output will be same like before!
https://github.com/YountenTshering/AT70.18_HomeWork/tree/master/HW7_Spring-Session/httpSession
