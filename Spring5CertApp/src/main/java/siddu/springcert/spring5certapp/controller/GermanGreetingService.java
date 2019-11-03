package siddu.springcert.spring5certapp.controller;

import org.springframework.stereotype.Service;

@Service
public class GermanGreetingService implements GreetingsService{

	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "Hallo "+name;
	}

}
