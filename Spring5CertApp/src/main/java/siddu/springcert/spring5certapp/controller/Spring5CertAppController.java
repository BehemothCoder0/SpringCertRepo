package siddu.springcert.spring5certapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import siddu.springcert.spring5certapp.model.Book;
import siddu.springcert.spring5certapp.repositories.AuthorRepository;
import siddu.springcert.spring5certapp.repositories.BookRepository;

@Controller
public class Spring5CertAppController {

	private BookRepository bookRepo;
	private AuthorRepository authorRepo;
	
	
	public Spring5CertAppController(BookRepository bookRepo,AuthorRepository authorRepo) {
		this.bookRepo = bookRepo;
		this.authorRepo = authorRepo;
	}



	@RequestMapping("/books")
	public String getBooks(Model model){
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}
	
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors",authorRepo.findAll());
		return "authors";
	}
	
	
}
