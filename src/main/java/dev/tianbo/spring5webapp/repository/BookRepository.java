package dev.tianbo.spring5webapp.repository;

import dev.tianbo.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
