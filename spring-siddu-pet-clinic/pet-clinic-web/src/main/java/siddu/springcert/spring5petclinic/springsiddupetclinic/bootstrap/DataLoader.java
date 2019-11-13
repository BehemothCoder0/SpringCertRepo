package siddu.springcert.spring5petclinic.springsiddupetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import siddu.springcert.spring5petclinic.springsiddupetclinic.model.Owner;
import siddu.springcert.spring5petclinic.springsiddupetclinic.model.Vet;
import siddu.springcert.spring5petclinic.springsiddupetclinic.service.OwnerService;
import siddu.springcert.spring5petclinic.springsiddupetclinic.service.VetService;
import siddu.springcert.spring5petclinic.springsiddupetclinic.service.map.OwnerServiceMap;
import siddu.springcert.spring5petclinic.springsiddupetclinic.service.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	
	
	
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}




	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Siddu");
		owner1.setLastName("Cherukumudi");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Bhavana");
		owner2.setLastName("Cherukumudi");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Jack");
		vet1.setLastName("Thompson");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Appalamma");
		vet2.setLastName("Thompson");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		

	}

}
