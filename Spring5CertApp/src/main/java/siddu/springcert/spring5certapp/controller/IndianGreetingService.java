package siddu.springcert.spring5certapp.controller;

import org.springframework.stereotype.Service;

@Service
public class IndianGreetingService implements GreetingsService{

	@Override
	public String greet(String name) {
		return "Namaste "+name;
		
	}

}
