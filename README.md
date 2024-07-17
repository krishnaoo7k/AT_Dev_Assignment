Its a CRUD project to fetch or update required data from database, in this project i have used following spring modules and other things

1. SpringBoot
2. Spring data Jpa
3. RESTAPI
4. PostgreSQL

I utilized Spring Boot and Spring Data JPA along with a PostgreSQL database to create the CRUD project. Firstly, I selected appropriate starter projects such as Spring Web, Spring JPA, PostgreSQL, and DevTools. Once these were integrated into my project, the necessary autoconfigurations were completed. The project mainly focused on managing Student information. I started by creating a student class annotated with @Entity, defining essential variables such as id, name, and age, followed by setting up getters, setters, constructors, and toString methods. Subsequently, I proceeded to develop the StudentService class, where I incorporated business logic(methods) for database interaction. Prior to this, I established a StudentRepository interface, extending it with JpaRepository to get the functionality of JPA. Within the StudentService class, I designed methods for data retrieval, updating, insertion, and deletion, leveraging autowiring with StudentRepository. To facilitate mapping, I introduced a @RestController class, autowired with StudentService, and mapped all the methods to their respective URLs. Finally, I utilized Postman to execute these operations via the Rest API.
