package siddu.springcert.spring5certapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import siddu.springcert.spring5certapp.model.Author;
import siddu.springcert.spring5certapp.model.Book;
import siddu.springcert.spring5certapp.repositories.AuthorRepository;
import siddu.springcert.spring5certapp.repositories.BookRepository;

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
	
	private void initData() {
		Author arthurHailey = new Author("Arthur", "Hailey");
		Book  airport = new Book("Airport", "air123", "MCGrawHill");
		Book wheels = new Book("Wheels", "whe123", "McGrawHill");
		arthurHailey.getBooks().add(airport);
		arthurHailey.getBooks().add(wheels);
		
		authorRepo.save(arthurHailey);
		bookRepo.save(airport);
		bookRepo.save(wheels);
		
		
		Author robertCook = new Author("Robert", "Cook");
		Book marker = new Book("Marker","mark123","Pearson");
		Book coma = new Book("Coma","coma123","Pearson");
		robertCook.getBooks().add(marker);
		robertCook.getBooks().add(coma);
		
		authorRepo.save(robertCook);
		bookRepo.save(marker);
		bookRepo.save(coma);
		
		authorRepo.findAll().forEach(author->{
			System.out.println("The author is:"+author.getFirstName()+" and his books are:"+author.getBooks());
		});
	}

}
