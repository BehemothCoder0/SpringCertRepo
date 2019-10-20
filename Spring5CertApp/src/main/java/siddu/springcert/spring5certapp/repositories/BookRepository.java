package siddu.springcert.spring5certapp.repositories;

import org.springframework.data.repository.CrudRepository;

import siddu.springcert.spring5certapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
