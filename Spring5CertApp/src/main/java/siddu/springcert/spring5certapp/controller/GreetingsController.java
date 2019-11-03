package siddu.springcert.spring5certapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingsController {
	
	/*private GreetingsService greetingService;
	
	private GreetingsService greetingServiceWithQualifier;
	
	
	
	public GreetingsController(GreetingsService indianGreetingService, @Qualifier("germanGreetingService")GreetingsService greetingServiceWithQualifier) {		
		this.greetingService = indianGreetingService;
		this.greetingServiceWithQualifier = greetingServiceWithQualifier;
	}



	public String greet(String name) {
		return greetingService.greet(name);
		
	}
	
	public String greetWithQualifier(String name) {
		return greetingServiceWithQualifier.greet(name);
	}*/
	
	private GreetingsService greetingService;

	public GreetingsController(GreetingsService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String greet(String name) {
		return greetingService.greet(name);
	}
	
	
}
