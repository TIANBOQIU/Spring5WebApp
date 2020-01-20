package dev.tianbo.spring5webapp.repository;

import dev.tianbo.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
