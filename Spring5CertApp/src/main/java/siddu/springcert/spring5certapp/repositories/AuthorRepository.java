package siddu.springcert.spring5certapp.repositories;

import org.springframework.data.repository.CrudRepository;

import siddu.springcert.spring5certapp.model.Author;

/**
 * @author I312117
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
