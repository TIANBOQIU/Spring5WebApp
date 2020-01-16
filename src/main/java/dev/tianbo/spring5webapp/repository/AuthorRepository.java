package dev.tianbo.spring5webapp.repository;


import dev.tianbo.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
