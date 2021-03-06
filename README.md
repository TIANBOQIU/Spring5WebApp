### Spring5 Web App using Spring Boot
#### Spring initializr
using *Spring boot* https://start.spring.io/

#### JPA
using *Hibernate* implementation of JPA and *H2* in-memory database in this project

developing against the relational database

database independent since we are using Hibernate

1. mark the class as a JPA @Entity
2. create an unique identifier for each Entity
3. mark relationship (define like @ManyToMany)
4. implement hashCode, equal (since we are using Set here and want the expected behaviour: book and author are identified by its unique id)and toString

#### Spring Data JPA, Spring Data Repository

Repository Pattern allows you to easily change the persistence layer

Use Hibernate for persistence to supported RDBS systems

Therefore you can stick to the JPA API and don't write SQL and manage DB by yourself.

There are ready made methods, and JPA will inject the implementations for our class which handles many heavy lifting for us.

1. create a new *repository* package
2. create repository interface for each class you want to persist
(e.g. extends the CRUD repository)

#### bootstrap initialization of our DB

init some data into our database, write a bootstrap class for our table

mark as a Spring @Component and do dependency injection

#### Refactor: add Publisher Entity

change the string representation of Publisher into a Publisher Entity, and create the publisher repository


#### Spring MVC

MVC is a common design pattern for web applications. A separation of *Model, View, and Controller*.

#### Configure Controllers (e.g. BookController.class)
1. Annotate Class with @Controller to register the class as a Spring Bean and as a Controller
2. Annotate routes (methods) with @RequestMapping 
3. Create the Repository field and its constructor for the dependency injection
4. Return the view name

#### using template engine for view (Thymeleaf)

> I got some error here because I didn't set an getter for Book.id

*Display A List of Authors*
1. create class and route (Author Controller)
2. autowire AuthorRepository by constructor
3. bind lists of authors to model
4. create the template view and use it

> need to use the camel case firstName rather than firstname


#### Spring Petclinic

you can find different examples here, and we go through it step by step in the next project.
https://github.com/spring-projects/spring-petclinic