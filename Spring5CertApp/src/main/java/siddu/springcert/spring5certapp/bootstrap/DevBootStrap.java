package siddu.springcert.spring5certapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import siddu.springcert.spring5certapp.model.Author;
import siddu.springcert.spring5certapp.model.Book;
import siddu.springcert.spring5certapp.repositories.AuthorRepository;
import siddu.springcert.spring5certapp.repositories.BookRepository;

import static java.util.Arrays.asList;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository authorRepo;
	private BookRepository bookRepo;
	
	

	public DevBootStrap(AuthorRepository authorRepo, BookRepository bookRepo) {
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();

	}

	/*
	Hi Siddartha. It looks like you added unsaved books to an author, then tried to save the author. When Hibernate
	attempts to create the relation in the `authored_books` join table, there were no entities to join on. An entity
	in memory that hasn't been persisted yet is considered transient:
	https://docs.jboss.org/hibernate/orm/3.3/reference/en-US/html/objectstate.html#objectstate-overview

	The books should be saved before they are added to the entity they join on.
	 */
	private void initData() {
        Book  airport = new Book("Airport", "air123", "MCGrawHill");
        Book wheels = new Book("Wheels", "whe123", "McGrawHill");
        bookRepo.save(airport);
        bookRepo.save(wheels);

        Author arthurHailey = new Author("Arthur", "Hailey");
        arthurHailey.getBooks().addAll(asList(airport, wheels));
        authorRepo.save(arthurHailey);

        Book marker = new Book("Marker","mark123","Pearson");
        Book coma = new Book("Coma","coma123","Pearson");
        bookRepo.save(marker);
        bookRepo.save(coma);

        Author robertCook = new Author("Robert", "Cook");
		robertCook.getBooks().addAll(asList(marker, coma));
		authorRepo.save(robertCook);

		authorRepo.findAll().forEach(author->{
			System.out.println("The author is:"+author.getFirstName()+" and his books are:"+author.getBooks());
		});
	}

}
