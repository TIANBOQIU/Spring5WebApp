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


