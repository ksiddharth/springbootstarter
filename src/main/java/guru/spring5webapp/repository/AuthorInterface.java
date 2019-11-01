package guru.spring5webapp.repository;

import guru.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorInterface extends CrudRepository<Author, Long> {
}
