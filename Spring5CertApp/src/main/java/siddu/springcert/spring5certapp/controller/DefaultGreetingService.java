package siddu.springcert.spring5certapp.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DefaultGreetingService implements GreetingsService{

	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Hello "+name;
	}

}
