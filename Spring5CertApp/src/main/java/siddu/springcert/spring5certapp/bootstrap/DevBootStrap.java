package siddu.springcert.spring5certapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import siddu.springcert.spring5certapp.model.Author;
import siddu.springcert.spring5certapp.model.Book;
import siddu.springcert.spring5certapp.model.Publisher;
import siddu.springcert.spring5certapp.repositories.AuthorRepository;
import siddu.springcert.spring5certapp.repositories.BookRepository;
import siddu.springcert.spring5certapp.repositories.PublisherRepository;

import static java.util.Arrays.asList;

import javax.swing.JButton;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository authorRepo;
	private BookRepository bookRepo;
	private PublisherRepository publisherRepo;
	
	

	public DevBootStrap(AuthorRepository authorRepo, BookRepository bookRepo, PublisherRepository publisherRepo) {
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo = publisherRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();

	}
	
	private void initData() {
		Publisher mcgrawhill = new Publisher("MCGrawHill");
		publisherRepo.save(mcgrawhill);
        Book  airport = new Book("Airport", "air123",mcgrawhill);
        bookRepo.save(airport);

        Author arthurHailey = new Author("Arthur", "Hailey");
        arthurHailey.getBooks().add(airport);
        authorRepo.save(arthurHailey);

        Publisher pearson = new Publisher("Pearson");
        publisherRepo.save(pearson);
        Book marker = new Book("Marker","mark123",pearson);
        bookRepo.save(marker);

        Author robertCook = new Author("Robert", "Cook");
		robertCook.getBooks().add(marker);
		authorRepo.save(robertCook);

		authorRepo.findAll().forEach(author->{
			System.out.println("The author is:"+author.getFirstName()+" and his books are:"+author.getBooks());
		});
		
		bookRepo.findAll().forEach(book->{
			System.out.println("The publisher is:"+book.getPublisher().getName());
		});
	}

}
