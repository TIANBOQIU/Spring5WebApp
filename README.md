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


