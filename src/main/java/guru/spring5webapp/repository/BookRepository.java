package guru.spring5webapp.repository;

import guru.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookInterface extends CrudRepository<Book, Long> {
}
